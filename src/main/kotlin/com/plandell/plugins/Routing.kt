package com.plandell.plugins

import com.plandell.routes.setupRoot
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        static("/images") {
            resources("images")
        }

        get("/") {
            call.respondText("Welcome to Movie Server")
        }

        setupRoot()
    }
}
