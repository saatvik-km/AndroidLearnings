package com.example.androidLearnings.poc.poc_MvvmRetrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidLearnings.poc.poc_MvvmRetrofit.api.ApiInterface
import com.example.androidLearnings.poc.poc_MvvmRetrofit.model.Jokes

class MemesRepository(private val apiInterface: ApiInterface) {

    private val memesLiveData = MutableLiveData<Jokes>()

    val memes: LiveData<Jokes>
        get() = memesLiveData

    suspend fun getMemes() {
        val result = apiInterface.getJokes()
        if (result.body() != null) {
            memesLiveData.postValue(result.body())
        }
    }

}