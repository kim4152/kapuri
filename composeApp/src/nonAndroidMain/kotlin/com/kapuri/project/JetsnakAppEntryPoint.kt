package com.kapuri.project

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.kapuri.project.di.initKoin
import com.kapuri.project.ui.KapuriApp


@Composable
fun JetSnackAppEntryPoint() {
    initKoin()
    CompositionLocalProvider {
        KapuriApp()
    }
}
