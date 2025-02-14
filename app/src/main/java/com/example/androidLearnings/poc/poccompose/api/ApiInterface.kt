package com.example.androidLearnings.poc.poccompose.api

import com.example.androidLearnings.poc.poccompose.model.AllMemesData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/get_memes")
    suspend fun getMemesList() : Response<AllMemesData>

}