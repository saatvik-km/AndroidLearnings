package com.example.androidLearnings.poc.poc_androidLifecycle.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidLearnings.R

class FirstFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment", "First fragment onAttach() is called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment", "First fragment onCreate() is called")
    }

    // Important !!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment", "First fragment onCreateView() is called")
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragment", "x fragment onViewCreated() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment", "First fragment onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment", "First fragment onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment", "First fragment onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment", "First fragment onStop() is called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment", "First fragment onDestroyView() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment", "First fragment onDestroy() is called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment", "First fragment onDetach() is called")
    }

}