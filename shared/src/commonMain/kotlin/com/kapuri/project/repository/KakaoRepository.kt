package com.kapuri.project.repository

interface KakaoRepository {
    suspend fun signIn()
}

class KakaoRepositoryImpl(

): KakaoRepository{
    override suspend fun signIn() {

    }

}
