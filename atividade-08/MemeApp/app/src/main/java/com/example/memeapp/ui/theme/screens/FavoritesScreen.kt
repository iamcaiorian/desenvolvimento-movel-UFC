package com.example.memeapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.memeapp.models.Meme
import com.example.memeapp.models.memeList
import com.example.memeapp.ui.theme.components.MemeListItem

@ExperimentalMaterial3Api
@Composable
fun FavoritesScreen(
    memes: List<Meme>, // Recebe a lista observável
    onMemeSelected: (Meme) -> Unit,
    onFavoriteToggle: (Meme) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Favoritos", style = MaterialTheme.typography.titleLarge) }
            )
        }
    ) { innerPadding ->
        val favoriteMemes = memes.filter { it.isFavorite }

        if (favoriteMemes.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Você ainda não adicionou favoritos.",
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(innerPadding)
            ) {
                items(favoriteMemes) { meme ->
                    MemeListItem(
                        meme = meme,
                        onMemeSelected = onMemeSelected,
                        onFavoriteToggle = { favoriteMeme ->
                            val index = memes.indexOf(favoriteMeme)
                            if (index != -1) {
                                (memes as MutableList)[index] =
                                    favoriteMeme.copy(isFavorite = !favoriteMeme.isFavorite)
                            }
                        }
                    )
                }
            }
        }
    }
}
