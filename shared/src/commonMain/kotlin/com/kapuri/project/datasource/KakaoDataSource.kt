package com.kapuri.project.datasource

import io.ktor.client.HttpClient

class KakaoDataSource(httpClient: HttpClient) {
    fun test(): String{
        return "Hello Koin"
    }
}
