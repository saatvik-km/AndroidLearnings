package com.example.androidLearnings.poc.poc_MvvmRetrofit.api

import com.example.androidLearnings.poc.poc_MvvmRetrofit.model.Jokes
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/get_memes")
    suspend fun getJokes() : Response<Jokes>

}