package com.example.androidLearnings.poc.pocmvvmretrofit.api

import com.example.androidLearnings.poc.pocmvvmretrofit.model.Jokes
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/get_memes")
    suspend fun getJokes() : Response<Jokes>

}