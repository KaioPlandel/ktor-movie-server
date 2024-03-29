package com.plandell.repository

import com.plandell.model.ApiResponse
import com.plandell.model.Movie

interface IMovieRepository {

    val movies: Map<String, List<Movie>>
    val topSession: List<Movie>
    val favoriteSession: List<Movie>
    val allMovies: List<Movie>

    fun getAllMovies(): ApiResponse

    fun getMovieById(id: Int): ApiResponse
    fun getMovieByName(name: String): ApiResponse

    fun getActionMovive(): ApiResponse
    fun getHorrorMovie(): ApiResponse

    fun getAdventureMovie(): ApiResponse

    fun getComedyMovie(): ApiResponse

    fun getTopMovies(): ApiResponse

    fun getFavoriteMovies(): ApiResponse
}