package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondactivity : AppCompatActivity() {
    lateinit var btnNexttwo: Button
    lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        btnNexttwo = findViewById(R.id.btnNexttwo)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNexttwo.setOnClickListener {
            val intent = Intent(this,thirdactivity::class.java)
            startActivity(intent)
        }
        btnPrevious.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}