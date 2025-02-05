package com.kapuri.project.ui.home

import androidx.compose.runtime.Composable
import com.kapuri.project.di.kakaoRepositoryModule
import com.kapuri.project.repository.KakaoRepository
import kotlin.experimental.ExperimentalObjCRefinement
import kotlin.native.HiddenFromObjC
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@OptIn(ExperimentalObjCRefinement::class)
@HiddenFromObjC
class HomeViewModel(
    private val kakaoRepository: KakaoRepository
): KapuriHomeViewModel() {
    private val _loginInfo = MutableStateFlow<String>("")
    val loginInfo = _loginInfo.asStateFlow()
    fun kakaoLogin(){
        val result = kakaoRepository.signIn()
        _loginInfo.value = result
    }
    companion object
}

@OptIn(ExperimentalObjCRefinement::class)
@HiddenFromObjC
expect abstract class KapuriHomeViewModel(){

}

@Composable
expect fun provideHomeViewModel(): HomeViewModel
