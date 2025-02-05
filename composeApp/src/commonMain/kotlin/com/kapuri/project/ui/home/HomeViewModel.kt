package com.kapuri.project.ui.home

import androidx.compose.runtime.Composable
import kotlin.experimental.ExperimentalObjCRefinement
import kotlin.native.HiddenFromObjC
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@OptIn(ExperimentalObjCRefinement::class)
@HiddenFromObjC
class HomeViewModel(): KapuriHomeViewModel() {
    private val _loginInfo = MutableStateFlow<String>("")
    val loginInfo = _loginInfo.asStateFlow()
    fun kakaoLogin(){
        _loginInfo.value = "kakao login"
    }
    companion object
}

@OptIn(ExperimentalObjCRefinement::class)
@HiddenFromObjC
expect abstract class KapuriHomeViewModel(){

}

@Composable
expect fun provideHomeViewModel(): HomeViewModel
