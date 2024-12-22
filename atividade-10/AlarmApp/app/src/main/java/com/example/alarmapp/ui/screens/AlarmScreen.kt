package com.example.alarmapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alarmapp.R
import com.example.alarmapp.utils.TimePickerDialogHandler
import com.example.alarmapp.utils.setAlarm

@Composable
fun AlarmScreen() {
    var hour by remember { mutableStateOf(0) }
    var minute by remember { mutableStateOf(0) }
    var showTimePicker by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Definir Alarme",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(top = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.icon_alarm),
            contentDescription = "Alarm Icon",
            modifier = Modifier
                .size(120.dp)
                .padding(16.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Button(
                onClick = { showTimePicker = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Text("Selecionar Hora", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = String.format("Hora selecionada: %02d:%02d", hour, minute),
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp),
                color = MaterialTheme.colorScheme.primary
            )

            TimePickerDialogHandler(
                show = showTimePicker,
                onTimeSelected = { selectedHour, selectedMinute ->
                    hour = selectedHour
                    minute = selectedMinute
                    showTimePicker = false
                },
                onDismiss = { showTimePicker = false }
            )
        }

        val context = LocalContext.current

        Button(
            onClick = {
                setAlarm(
                    context = context,
                    hour = hour,
                    minute = minute
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .clip(RoundedCornerShape(16.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text("Configurar Alarme", fontSize = 18.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}
