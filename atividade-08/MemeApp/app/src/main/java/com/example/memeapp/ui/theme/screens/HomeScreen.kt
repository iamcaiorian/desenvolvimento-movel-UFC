package com.example.memeapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.memeapp.models.Meme
import com.example.memeapp.ui.theme.components.MemeListItem
import com.example.memeapp.ui.components.TopAppBarWithMenu

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(
    memes: MutableList<Meme>, // Lista observável
    onMemeSelected: (Meme) -> Unit,
    onSettingsClick: () -> Unit,
    onHelpClick: () -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    val filteredMemes = remember(searchQuery) {
        memes.filter { it.nome.contains(searchQuery, ignoreCase = true) }
    }

    Scaffold(
        topBar = {
            TopAppBarWithMenu(
                onSettingsClick = onSettingsClick,
                onHelpClick = onHelpClick
            )
        }
    ) { innerPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(filteredMemes) { meme ->
                MemeListItem(
                    meme = meme,
                    onMemeSelected = onMemeSelected,
                    onFavoriteToggle = { favoriteMeme ->
                        val index = memes.indexOf(favoriteMeme)
                        if (index != -1) {
                            memes[index] = favoriteMeme.copy(isFavorite = !favoriteMeme.isFavorite)
                        }
                    }
                )
            }
        }
    }
}
