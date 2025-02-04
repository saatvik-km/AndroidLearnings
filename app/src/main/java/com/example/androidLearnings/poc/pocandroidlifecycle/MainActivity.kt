package com.example.androidLearnings.poc.pocandroidlifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidLearnings.R

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private lateinit var plusOneButton: Button
    private lateinit var nextActivityButton: Button
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        counterTextView = findViewById(R.id.counterTextView)
        plusOneButton = findViewById(R.id.plusOneButton)
        nextActivityButton = findViewById(R.id.nextActivityButton)

        Log.i("Message", "First activity onCreate() is called")

        plusOneButton.setOnClickListener {
            counter++
            counterTextView.text = "$counter"
        }

        nextActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(COUNTER_VALUE, counter)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Message", "First activity onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Message", "First activity onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Message", "First activity onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Message", "First activity onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Message", "First activity onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Message", "First activity onRestart() is called")
    }
}