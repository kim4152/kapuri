package com.kapuri.project.repository

import com.kapuri.project.datasource.KakaoDataSource
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KakaoRepository : KoinComponent {
    private val kakaoDataSource: KakaoDataSource by inject()

    fun signIn(): String {
        return kakaoDataSource.test()
    }
}
