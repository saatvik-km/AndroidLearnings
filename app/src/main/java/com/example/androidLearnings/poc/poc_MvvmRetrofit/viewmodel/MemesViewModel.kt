package com.example.androidLearnings.poc.poc_MvvmRetrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidLearnings.poc.poc_MvvmRetrofit.model.Jokes
import com.example.androidLearnings.poc.poc_MvvmRetrofit.repository.MemesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MemesViewModel(private val memesRepository: MemesRepository): ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO) {
            memesRepository.getMemes()
        }
    }

    val memes: LiveData<Jokes>
        get() = memesRepository.memes
}