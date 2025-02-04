package com.example.androidLearnings.poc.poc_MvvmRetrofit.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidLearnings.poc.poc_MvvmRetrofit.repository.MemesRepository

class MemesViewModelFactory(private val memesRepository: MemesRepository): ViewModelProvider.Factory {

    override fun <T: ViewModel> create(modelClass: Class<T>): T {
        return MemesViewModel(memesRepository) as T
    }

}