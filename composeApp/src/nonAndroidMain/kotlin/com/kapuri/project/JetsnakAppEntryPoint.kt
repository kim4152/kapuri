package com.kapuri.project

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider


@Composable
fun JetSnackAppEntryPoint() {
    CompositionLocalProvider {
        App()
    }
}
