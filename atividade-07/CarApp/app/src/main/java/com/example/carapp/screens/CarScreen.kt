package com.example.carapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.carapp.models.Car

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarScreen(car: Car) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("${car.brand} ${car.model}") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagem do carro
            Image(
                painter = painterResource(id = car.imageRes),
                contentDescription = "${car.brand} ${car.model} Image",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Ano e cor do carro
            Text(
                text = "${car.year} - ${car.color}",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Descrição do carro
            Text(
                text = car.description,
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Preço e quilometragem
            Text(
                text = "Preço: $${car.price} | Quilometragem: ${car.mileage} km",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.secondary
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
