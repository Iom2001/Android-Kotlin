package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Activity_Transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidkotlin.R

class Activity_Transition1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__transition)

        val btn1 = findViewById<Button>(R.id.buttonTransition)

        btn1.setOnClickListener {
            startActivity(Intent(this, Activity_Transition2::class.java))
            finish()
        }
    }
}
