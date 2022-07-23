package com.project.movieapp.api

import com.example.movieapp.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val httpClient = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .client(httpClient)
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    val instance: ApiService = retrofit.build().create(ApiService::class.java)

}