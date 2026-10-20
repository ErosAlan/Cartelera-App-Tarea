package com.example.cartelera

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cartelera.ui.theme.RegistroScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "login",
        modifier = modifier
    ) {
        composable("login") {
            LoginScreen(
                onRegistrarse = { navController.navigate("registro") },
                onLoginOk = {
                    navController.navigate("peliculas") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }
        composable("registro") {
            RegistroScreen(
                onRegistroOk = {
                    navController.navigate("peliculas") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                onCancelar = {
                    navController.popBackStack()
                }
            )
        }
        composable("peliculas") {
            PeliculasScreen(
                onPeliculaClick = { id ->
                    navController.navigate("detalle/$id")
                }
            )
        }
        composable(
            route = "detalle/{id}",
            arguments = listOf(
                navArgument("id") { type = NavType.IntType }
            )
        ) { entrada ->
            val id = entrada.arguments?.getInt("id") ?: 1
            DetalleScreen(
                peliculaId = id,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
