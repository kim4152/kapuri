package com.kapuri.project.di

import com.kapuri.project.createHttpClient
import com.kapuri.project.datasource.KakaoDataSource
import com.kapuri.project.getEngine
import com.kapuri.project.repository.KakaoRepository
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule: Module = module {
    single { createHttpClient(getEngine()) }
}
val kakaoDataSourceModule: Module = module {
    single { KakaoDataSource(get()) }
}
val kakaoRepositoryModule: Module = module{
    single { KakaoRepository() }
}

fun initKoin() = startKoin {
    modules(networkModule, kakaoDataSourceModule, kakaoRepositoryModule )
}
