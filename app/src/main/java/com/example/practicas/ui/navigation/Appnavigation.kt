package com.example.practicas.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicas.ui.screens.InicioScreen
import com.example.practicas.ui.screens.MainScreen
import com.example.practicas.ui.screens.SecundariaScreen
import com.example.practicas.ui.screens.TerceraScreen

@Composable
fun Appnavigation (){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio"){
        composable ("inicio"){ InicioScreen(navController) }
        composable ("main") {MainScreen(navController)}
        composable ("secundaria"){ SecundariaScreen(navController) }
        composable ("tercera"){ TerceraScreen(navController) }
    }
}