package com.plandell.routes

import com.plandell.repository.IMovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.setupMovieById(){
    val repository: IMovieRepository by inject()

    get("movie/v1") {
        try {
            val id = call.request.queryParameters["id"]?.toInt() ?: throw Exception("The ID is required")
            val response = repository.getMovieById(id)
            call.respond(
                message = response,
                status = HttpStatusCode.OK
            )
        } catch (e: Exception){
            call.respond(
                message = "Pass the ID",
                status = HttpStatusCode.BadRequest
            )
        }
    }
}