package com.example.memeapp.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateListOf
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.memeapp.models.Meme
import com.example.memeapp.models.memeList
import com.example.memeapp.ui.components.BottomNavigationBar
import com.example.memeapp.ui.theme.screens.DetailsScreen
import com.example.memeapp.ui.theme.screens.FavoritesScreen
import com.example.memeapp.ui.theme.screens.HomeScreen

@ExperimentalMaterial3Api
@Composable
fun NavGraph(
    onSettingsClick: () -> Unit,
    onHelpClick: () -> Unit
) {
    val navController = rememberNavController()
    // Torne a lista observável
    val memes = remember { mutableStateListOf(*memeList.toTypedArray()) }

    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomBarScreen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomBarScreen.Home.route) {
                HomeScreen(
                    memes = memes,
                    onMemeSelected = { meme ->
                        navController.navigate("details/${meme.nome}")
                    },
                    onSettingsClick = onSettingsClick,
                    onHelpClick = onHelpClick
                )
            }
            composable(BottomBarScreen.Favorites.route) {
                FavoritesScreen(
                    memes = memes, // Passe a lista observável
                    onMemeSelected = { meme ->
                        navController.navigate("details/${meme.nome}")
                    },
                    onFavoriteToggle = { meme ->
                        val index = memes.indexOf(meme)
                        if (index != -1) {
                            memes[index] = meme.copy(isFavorite = !meme.isFavorite)
                        }
                    }
                )
            }
            composable("details/{memeNome}") { backStackEntry ->
                val memeNome = backStackEntry.arguments?.getString("memeNome")
                val selectedMeme = memes.firstOrNull { it.nome == memeNome }
                if (selectedMeme != null) {
                    DetailsScreen(selectedMeme, onBack = { navController.popBackStack() })
                }
            }
        }
    }
}
