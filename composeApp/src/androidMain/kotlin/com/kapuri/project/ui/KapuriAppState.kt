package com.kapuri.project.ui

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

actual class KapuriAppState(
    actual val scaffoldState: ScaffoldState,
    val navController: NavHostController,
){
    actual val currentRoute: String?
        get() = navController.currentDestination?.route

    actual fun navigateToSecond(route: String){
        if (route != currentRoute){
            navController.navigate(route)
        }
    }

    fun navigateToHome(route: String){
        if (route != currentRoute){
            navController.navigate(route)
        }
    }
}

@Composable
actual fun rememberKapuriAppState(): KapuriAppState {

    return com.kapuri.project.ui.KapuriAppState(
        scaffoldState = rememberScaffoldState(),
        navController = rememberNavController(),
    )
}
