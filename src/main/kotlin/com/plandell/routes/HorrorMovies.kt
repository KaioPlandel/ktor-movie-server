package com.plandell.routes

import com.plandell.repository.IMovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.setupHorrorMovies() {
    val repository: IMovieRepository by inject()
    get("/movies/horror") {
        try {
            val response = repository.getHorrorMovie()
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