package com.plandell.routes

import com.plandell.repository.IMovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.setupAllMovies(){
    val repository: IMovieRepository by inject()
    get("/movies/v1"){
        try {
            val session = call.request.queryParameters["session"] ?: "lasted"
            val response = repository.getAllMovies(session)
            call.respond(
                message = response,
                status = HttpStatusCode.OK
            )
        }catch (e : Exception){
            call.respond(
                message = "Movies not found",
                status = HttpStatusCode.NotFound
            )
        }
    }
}