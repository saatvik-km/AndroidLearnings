package com.example.androidLearnings.poc.pocmvvmretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidLearnings.poc.pocmvvmretrofit.api.ApiInterface
import com.example.androidLearnings.poc.pocmvvmretrofit.model.Jokes

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