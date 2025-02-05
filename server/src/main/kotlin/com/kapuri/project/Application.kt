package com.kapuri.project

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File
import java.util.Properties

fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}


fun Application.module(){
    routing {
//        get(""){
//            val clientId = ""
//            val redirectUri = ""
//            val kakaoAuthUrl = ""
//            call.respondRedirect(kakaoAuthUrl)
//        }
//
//        get(""){
//            val code = call.request.queryParameters[""]
//            if (code.isNullOrEmpty()){
//                call.respond(HttpStatusCode.BadRequest, "Authorization code is missing")
//                return@get
//            }
//
//            val tokenResponse = ktorHttpClient.post(""){
//                parameter("","")
//                //...
//            }.body<DataClass>()
//
//            val accessToken = tokenResponse.access_token
//
//            val userResponse = ktorHttpClient.get(""){
//                header("","")
//            }.body<DataClass>()
//
//            call.respond(HttpStatusCode.OK, userResponse)
//
//        }
//    }

        get("/naver"){
            call.respondRedirect("https://www.naver.com")
        }
    }
}

