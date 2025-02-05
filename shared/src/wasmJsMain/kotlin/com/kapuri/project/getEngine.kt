package com.kapuri.project

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.engine.js.Js

actual fun getEngine(): HttpClientEngine{
    return Js.create()
}
