package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thirdactivity : AppCompatActivity() {
    lateinit var btnNextthree: Button
    lateinit var btncoderfive: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)
        btnNextthree = findViewById(R.id.btnNextthree)
        btncoderfive = findViewById(R.id.btncoderfive)
        btnNextthree.setOnClickListener {
            val intent= Intent(this,fourthactivity::class.java)
            startActivity(intent)
        }
        btncoderfive.setOnClickListener {
            val intent= Intent(this,secondactivity::class.java)
            startActivity(intent)
        }
    }
}