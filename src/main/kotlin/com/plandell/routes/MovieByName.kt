package com.plandell.routes

import com.plandell.repository.IMovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.setupMovieByname(){

    val repository: IMovieRepository by inject()

    get("/movies/v1/search"){
        try {
            val name = call.request.queryParameters["name"].toString()
            val response = repository.getMovieByName(name)
            call.respond(
                message = response,
                status = HttpStatusCode.OK
            )
        }catch (e : Exception) {
            call.respond(
                message = "Movie not Found",
                status = HttpStatusCode.NotFound
            )
        }
    }
}