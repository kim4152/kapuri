package com.kapuri.project.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun KapuriApp() {
    MaterialTheme {
        val appState = rememberKapuriAppState()
        Scaffold {  innerPading ->
            KapuriScaffoldContent(
                innerPadding = innerPading,
                appState = appState
            )
        }
    }
}

@Composable
expect fun KapuriScaffoldContent(innerPadding: PaddingValues, appState: KapuriAppState)
