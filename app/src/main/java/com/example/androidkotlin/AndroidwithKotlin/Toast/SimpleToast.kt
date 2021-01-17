package com.example.androidkotlin.AndroidwithKotlin.Toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.androidkotlin.R

class SimpleToast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_toast)

        val btnS = findViewById<Button>(R.id.button) as Button
        val btnL = findViewById<Button>(R.id.button1) as Button


        btnS.setOnClickListener {

            Toast.makeText(this, " This is Short Toast Message ", Toast.LENGTH_SHORT).show()

        }

        btnL.setOnClickListener {

            Toast.makeText(this, " This is Long Toast Message ", Toast.LENGTH_LONG).show()

        }
    }
}
