package com.project.movieapp.api

import com.example.movieapp.BuildConfig.API_KEY
import com.example.movieapp.response.ListResponse
import com.example.movieapp.response.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("movie/{movie_id}?api_key=$API_KEY")
    fun getMovieById(@Path("movie_id") id: Int): Call<MovieResponse>

}