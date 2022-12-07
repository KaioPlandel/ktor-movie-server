package com.plandell.model

@kotlinx.serialization.Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String,
    val movies: List<Movie> = emptyList()
)
