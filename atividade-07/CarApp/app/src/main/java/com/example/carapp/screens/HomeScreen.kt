package com.example.carapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.carapp.models.Car
import com.example.carapp.models.carList
import com.example.carapp.ui.theme.components.CarListItem

@Composable
fun HomeScreen(onCarSelected: (Car) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }
    val filteredCars = remember(searchQuery) {
        carList.filter { it.model.contains(searchQuery, ignoreCase = true) ||
                it.brand.contains(searchQuery, ignoreCase = true) }
    }

    Column {
        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Pesquisar") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            items(filteredCars) { car ->
                CarListItem(car, onCarSelected)
            }
        }
    }
}
