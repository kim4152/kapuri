package com.kapuri.project.ui.home

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kapuri.project.repository.KakaoRepository

fun HomeViewModel.Companion.provideFactory(): ViewModelProvider.Factory =
    object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(
                KakaoRepository()
            ) as T
        }
    }

@OptIn(kotlin.ExperimentalMultiplatform::class)
actual abstract class KapuriHomeViewModel actual constructor() : ViewModel() {

}

@Composable
actual fun provideHomeViewModel(): HomeViewModel {
    return viewModel(factory = HomeViewModel.provideFactory())
}
