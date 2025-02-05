package com.kapuri.project.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.kapuri.project.repository.KakaoRepository
import kotlin.experimental.ExperimentalObjCRefinement
import kotlin.native.HiddenFromObjC

@OptIn(ExperimentalObjCRefinement::class)
@HiddenFromObjC
actual abstract class KapuriHomeViewModel actual constructor(){

}

@Composable
actual fun provideHomeViewModel(): HomeViewModel{
    return remember { HomeViewModel(KakaoRepository()) }
}
