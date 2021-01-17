package com.example.androidkotlin.AndroidwithKotlin.Time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.Toast
import com.example.androidkotlin.R

class TextClockA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_clock)

        val tClock = findViewById<TextClock>(R.id.textClock)
        tClock.setOnClickListener {
            Toast.makeText(this, "This is TextClock", Toast.LENGTH_SHORT).show()
        }
    }
}
