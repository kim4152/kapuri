package com.kapuri.project

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

fun getEngine(): HttpClientEngine{
    return Darwin.create()
}
