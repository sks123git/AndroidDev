package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val textView: TextView = findViewById(R.id.greetingsTextView)
        val dataDisplay: String = intent.getStringExtra("data") ?: "No data"
        var greetings = "Happy Birthday $dataDisplay"
        textView.text = greetings
    }
}