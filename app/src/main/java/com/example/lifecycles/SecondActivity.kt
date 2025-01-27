package com.example.lifecycles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    lateinit var result: TextView
    lateinit var prevButton: Button
    lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        result = findViewById(R.id.resultView)
        var counterValue = intent.getIntExtra("counterValue", 0)
        result.setText("You clicked the button $counterValue times")


        prevButton = findViewById(R.id.button3)
        prevButton.setOnClickListener {
            var intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

        nextButton = findViewById(R.id.button4)
        nextButton.setOnClickListener {
            var intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3)
        }

        Log.i("Message", "Second activity onCreate() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Message", "Second activity onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Message", "Second activity onResume() is called")
    }


    override fun onPause() {
        super.onPause()
        Log.i("Message", "Second activity onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Message", "Second activity onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Message", "Second activity onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Message", "Second activity onRestart() is called")
    }
}