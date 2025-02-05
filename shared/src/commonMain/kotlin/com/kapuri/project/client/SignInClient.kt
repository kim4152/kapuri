package com.kapuri.project.client

import com.kapuri.project.util.NetworkError
import io.ktor.client.HttpClient
import io.ktor.util.network.UnresolvedAddressException
import com.kapuri.project.util.Result
import io.ktor.client.request.get
import kotlinx.serialization.SerializationException

class SignInClient(
    private val httpClient: HttpClient
) {
    suspend fun signIn(): Result<String, NetworkError>{
        val response = try{
            httpClient.get(
                urlString = ""
            ){
                // parameter()
            }
        }catch (e: UnresolvedAddressException){
            return Result.Error(NetworkError.NO_INTERNET)
        }catch (e: SerializationException){
            return Result.Error(NetworkError.SERIALIZATION)
        }

        return when(response.status.value){
            in 200 .. 299 ->{
                Result.Success("")
            }
            401 -> Result.Error(NetworkError.UNAUTHORIZED)
            409 -> Result.Error(NetworkError.CONFLICT)
            408 -> Result.Error(NetworkError.REQUEST_TIMEOUT)
            413 -> Result.Error(NetworkError.PAYLOAD_TOO_LARGE)
            in 500..599 -> Result.Error(NetworkError.SERVER_ERROR)
            else -> Result.Error(NetworkError.UNKNOWN)
        }
    }
}
