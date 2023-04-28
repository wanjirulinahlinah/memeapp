package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourthactivity : AppCompatActivity() {
//    lateinit var btnNextsix: Button
    lateinit var btnPreviouss: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthactivity)
//        btnNextsix = findViewById(R.id.btnNextsix)
        btnPreviouss = findViewById(R.id.btnPreviouss)
        btnPreviouss.setOnClickListener {
            val intent = Intent(this,thirdactivity::class.java)
            startActivity(intent)
        }
    }
}