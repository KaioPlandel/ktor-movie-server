package com.plandell.repository

import com.plandell.model.ApiResponse
import com.plandell.model.Movie

interface IMovieRepository {

    val movies: Map<String,List<Movie>>

    val lastedSession: List<Movie>
    val topSession: List<Movie>
    val favoriteSession: List<Movie>

    fun getAllMovies(session: String): ApiResponse

    fun getMovieById(id: Int): ApiResponse
    fun getMovieByName(name: String): ApiResponse
}