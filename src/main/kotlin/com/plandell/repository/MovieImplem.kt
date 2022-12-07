package com.plandell.repository

import com.plandell.model.ApiResponse
import com.plandell.model.Movie

class MovieImplem : IMovieRepository {

    override val movies: Map<String, List<Movie>> by lazy {
        mapOf(
            "lasted" to lastedSession,
            "top" to topSession,
            "favorite" to favoriteSession
        )
    }

    override val lastedSession: List<Movie> = listOf(
        Movie(
            id = 1,
            title = "The Last Man",
            description = "The Last Man” is a thoroughly unpleasant experience from start to finish, and not even in an artful way. It is relentlessly bleak, smothered in more shades of gray than kinky Christian ever could have conjured and photographed with an oppressive sameness.",
            image = "/images/thelastman.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 2,
            title = "Avatar",
            image = "/images/avatar.png",
            description = "Jake Sully lives with his newfound family formed on the planet of Pandora. Once a familiar threat returns to finish what was previously started, Jake must work with Neytiri and the army of the Na'vi race to protect their planet.",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 3,
            title = "Prey",
            description = "Naru, a skilled warrior of the Comanche Nation, fights to protect her tribe against one of the first highly-evolved Predators to land on Earth.",
            image = "/images/prey.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 4,
            title = "Smile",
            description = "After witnessing a bizarre, traumatic incident involving a patient, Dr. Rose Cotter starts experiencing frightening occurrences that she can't explain. Rose must confront her troubling past in order to survive and escape her horrifying new reality.",
            image = "/images/smile.png",
            categories = listOf("Action", "Horror"),
            rating = 5.8,
        ),
        Movie(
            id = 5,
            title = "Memory",
            description = "An assassin-for-hire finds that he's become a target after he refuses to complete a job for a dangerous criminal organization.",
            image = "/images/memory.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 6,
            title = "The Northman",
            description = "A young Viking prince is on a quest to avenge his father's murder.",
            image = "/images/thenortham.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
    )

    override val topSession: List<Movie> = listOf(
        Movie(
            id = 7,
            title = "The Last Man",
            description = "The Last Man” is a thoroughly unpleasant experience from start to finish, and not even in an artful way. It is relentlessly bleak, smothered in more shades of gray than kinky Christian ever could have conjured and photographed with an oppressive sameness.",
            image = "/images/thelastman.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 8,
            title = "Avatar",
            image = "/images/avatar.png",
            description = "Jake Sully lives with his newfound family formed on the planet of Pandora. Once a familiar threat returns to finish what was previously started, Jake must work with Neytiri and the army of the Na'vi race to protect their planet.",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 9,
            title = "Prey",
            description = "Naru, a skilled warrior of the Comanche Nation, fights to protect her tribe against one of the first highly-evolved Predators to land on Earth.",
            image = "/images/prey.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 10,
            title = "Smile",
            description = "After witnessing a bizarre, traumatic incident involving a patient, Dr. Rose Cotter starts experiencing frightening occurrences that she can't explain. Rose must confront her troubling past in order to survive and escape her horrifying new reality.",
            image = "/images/smile.png",
            categories = listOf("Action", "Horror"),
            rating = 5.8,
        ),
        Movie(
            id = 11,
            title = "Memory",
            description = "An assassin-for-hire finds that he's become a target after he refuses to complete a job for a dangerous criminal organization.",
            image = "/images/memory.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 12,
            title = "The Northman",
            description = "A young Viking prince is on a quest to avenge his father's murder.",
            image = "/images/thenortham.png",
            categories = listOf("Action"),
            rating = 5.8,
        )
    )

    override val favoriteSession: List<Movie> = listOf(
        Movie(
            id = 13,
            title = "The Last Man",
            description = "The Last Man” is a thoroughly unpleasant experience from start to finish, and not even in an artful way. It is relentlessly bleak, smothered in more shades of gray than kinky Christian ever could have conjured and photographed with an oppressive sameness.",
            image = "/images/thelastman.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 14,
            title = "Avatar",
            image = "/images/avatar.png",
            description = "Jake Sully lives with his newfound family formed on the planet of Pandora. Once a familiar threat returns to finish what was previously started, Jake must work with Neytiri and the army of the Na'vi race to protect their planet.",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 15,
            title = "Prey",
            description = "Naru, a skilled warrior of the Comanche Nation, fights to protect her tribe against one of the first highly-evolved Predators to land on Earth.",
            image = "/images/prey.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 16,
            title = "Smile",
            description = "After witnessing a bizarre, traumatic incident involving a patient, Dr. Rose Cotter starts experiencing frightening occurrences that she can't explain. Rose must confront her troubling past in order to survive and escape her horrifying new reality.",
            image = "/images/smile.png",
            categories = listOf("Action", "Horror"),
            rating = 5.8,
        ),
        Movie(
            id = 17,
            title = "Memory",
            description = "An assassin-for-hire finds that he's become a target after he refuses to complete a job for a dangerous criminal organization.",
            image = "/images/memory.png",
            categories = listOf("Action"),
            rating = 5.8,
        ),
        Movie(
            id = 18,
            title = "The Northman",
            description = "A young Viking prince is on a quest to avenge his father's murder.",
            image = "/images/thenortham.png",
            categories = listOf("Action"),
            rating = 5.8,
        )
    )

    override fun getAllMovies(session: String): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            movies = movies[getSessionMovies(session)]!!
        )
    }

    override fun searchMovie(name: String): ApiResponse {
        TODO("Not yet implemented")
    }

    override fun getMovieById(id: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    fun getSessionMovies(session: String?): String {
        if (session == null) return "lasted"
        return session
    }
}