package com.plandell.routes

import com.plandell.repository.IMovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.setupComedyMovies() {
    val repository: IMovieRepository by inject()
    get("/movies/comedy") {
        try {
            val response = repository.getComedyMovie()
            call.respond(
                message = response,
                status = HttpStatusCode.OK
            )
        } catch (e: Exception) {
            call.respond(
                message = "Movies not found" + e.message.toString(),
                status = HttpStatusCode.NotFound
            )
        }
    }
}