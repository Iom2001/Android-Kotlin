package com.example.androidkotlin.AndroidwithKotlin.Animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.androidkotlin.R

class Move : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
        val btnTop = findViewById<Button>(R.id.top_Button)
        val btnRight = findViewById<Button>(R.id.right_Button)
        val btnBottom = findViewById<Button>(R.id.bottom_Button)
        val btnLeft = findViewById<Button>(R.id.left_Button)

        btnTop.setOnClickListener {
            val image = findViewById<ImageView>(R.id.image_View1)

        }
        btnRight.setOnClickListener {

        }

        btnLeft.setOnClickListener {

        }

        btnBottom.setOnClickListener {

        }
    }
}
