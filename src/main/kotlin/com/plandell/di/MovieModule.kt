package com.plandell.di

import com.plandell.repository.IMovieRepository
import com.plandell.repository.MovieImplem
import org.koin.dsl.module

val movieModule = module {
    single<IMovieRepository> {
        MovieImplem()
    }
}