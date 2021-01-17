package com.example.androidkotlin.AndroidwithKotlin.Image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.androidkotlin.R

class ImageViewA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
        val img = findViewById<ImageView>(R.id.imageViewA)
        img.setOnClickListener {
            Toast.makeText(this, "Image View was Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
