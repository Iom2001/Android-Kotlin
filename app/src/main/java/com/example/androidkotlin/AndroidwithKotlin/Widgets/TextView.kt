package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidkotlin.R
import kotlinx.android.synthetic.main.activity_text_view.*

class TextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)
        textHello.setOnClickListener {
            Toast.makeText(this, "Hello Kotlin", Toast.LENGTH_SHORT).show()
        }
    }
}
