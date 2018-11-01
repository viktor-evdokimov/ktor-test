package com.vittore.apitest

import io.ktor.application.*
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    embeddedServer(
            Netty,
            port = 8080,
            watchPaths = listOf("apitest"),
            module = Application::mymodule
    ).start(wait = true)
}

fun Application.mymodule() {
    install(CallLogging)
    install(DefaultHeaders)
    routing {

        get("/") {
            call.respondText("Hello World!")
        }
    }
}

