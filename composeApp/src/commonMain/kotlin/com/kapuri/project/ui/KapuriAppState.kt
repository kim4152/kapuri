package com.kapuri.project.ui

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

@Stable
expect class KapuriAppState{
    val scaffoldState: ScaffoldState
    val currentRoute: String?

    fun navigateToSecond(route: String)
}

@Composable
expect fun rememberKapuriAppState(): KapuriAppState

object MainDestinations {
    const val HOME_ROUTE = "home"
    const val SECOND = "second"
}
