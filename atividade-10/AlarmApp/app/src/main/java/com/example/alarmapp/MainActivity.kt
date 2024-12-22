package com.example.alarmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.alarmapp.ui.screens.AlarmScreen
import com.example.alarmapp.ui.theme.AlarmAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AlarmAppTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    AlarmScreen()
                }
            }
        }
    }
}
