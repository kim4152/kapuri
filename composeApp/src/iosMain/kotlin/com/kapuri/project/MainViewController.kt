package com.kapuri.project

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController{ JetSnackAppEntryPoint() }
