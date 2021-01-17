package com.example.androidkotlin.AndroidwithKotlin.Image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.androidkotlin.R

class ImageButtonA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
        val img1 = findViewById<ImageButton>(R.id.imageButton)
        img1.setOnClickListener {
            Toast.makeText(this, "Image Button was Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
