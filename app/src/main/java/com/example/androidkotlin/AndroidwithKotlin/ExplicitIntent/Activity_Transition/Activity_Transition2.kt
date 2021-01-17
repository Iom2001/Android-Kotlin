package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Activity_Transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidkotlin.R

class Activity_Transition2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__transition2)
        val btn2 = findViewById<Button>(R.id.buttonTransition2)

        btn2.setOnClickListener {
            startActivity(Intent(this, Activity_Transition1::class.java))
            finish()
        }
    }
}
