package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import com.example.androidkotlin.R

class RatingBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

        val click = findViewById<Button>(R.id.button)
        val ratingBar = findViewById<RatingBar>(R.id.rating)

        click.setOnClickListener {
            val ratingBarValue = ratingBar.rating
            Toast.makeText(this, "Rating :- $ratingBarValue", Toast.LENGTH_SHORT).show()
        }
    }
}
