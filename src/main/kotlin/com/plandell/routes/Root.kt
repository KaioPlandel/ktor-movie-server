package com.plandell.routes

import io.ktor.server.routing.*

fun Route.setupRoot(){
    setupAllMovies()
    setupMovieById()
    setupMovieByname()
    setupComedyMovies()
    setupHorrorMovies()
    setupAdventureMovies()
    setupActionMovies()
    setupFavoriteMovies()
    setupTopMovies()
}