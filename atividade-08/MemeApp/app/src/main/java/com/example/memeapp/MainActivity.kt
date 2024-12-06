package com.example.memeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.memeapp.navigation.NavGraph

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var showSettingsDialog by remember { mutableStateOf(false) }
            var showHelpDialog by remember { mutableStateOf(false) }

            NavGraph(
                onSettingsClick = {
                    showSettingsDialog = true
                },
                onHelpClick = {
                    showHelpDialog = true
                }
            )

            if (showSettingsDialog) {
                SettingsDialog(onDismiss = { showSettingsDialog = false })
            }

            if (showHelpDialog) {
                HelpDialog(onDismiss = { showHelpDialog = false })
            }
        }
    }
}


@Composable
fun SettingsDialog(onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = "Configurações")
        },
        text = {
            Text(text = "Aqui você pode configurar as preferências do aplicativo.")
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(text = "Fechar")
            }
        }
    )
}


@Composable
fun HelpDialog(onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = "Ajuda")
        },
        text = {
            Text(text = "Esta é a seção de ajuda. Entre em contato se precisar de suporte!")
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(text = "Entendi")
            }
        }
    )
}