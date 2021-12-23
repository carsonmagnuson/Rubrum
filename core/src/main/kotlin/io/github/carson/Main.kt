package io.github.carson

import io.github.carson.http.SinglePageApplication
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 80, host = "0.0.0.0") {
        install(SinglePageApplication) {
            folderPath = "static"
            ignoreIfContains = Regex("^/api.*$")
        }
        configureRouting()
    }.start(wait = true)
}

fun Application.configureRouting() {
}