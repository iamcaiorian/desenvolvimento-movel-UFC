package com.example.carapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carapp.screens.CarScreen
import com.example.carapp.ui.screens.HomeScreen
import com.example.carapp.models.carList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "home") {
        // Home Screen
        composable("home") {
            HomeScreen(onCarSelected = { car ->
                navController.navigate("car/${car.id}")
            })
        }

        // Car Screen
        composable("car/{carId}") { backStackEntry ->
            val carId = backStackEntry.arguments?.getString("carId")?.toIntOrNull()
            val selectedCar = carList.firstOrNull { it.id == carId }
            selectedCar?.let { car ->
                CarScreen(car = car)
            }
        }
    }
}