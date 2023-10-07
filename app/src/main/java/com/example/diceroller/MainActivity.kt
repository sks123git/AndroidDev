package com.example.diceroller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createCard(view: View) {
        val nameInput: EditText? = findViewById(R.id.enter_The_Name)
        val name = nameInput?.text.toString()
        val intent = Intent(this, GreetingActivity::class.java)
        intent.putExtra("data", name)
        startActivity(intent)
    }
}