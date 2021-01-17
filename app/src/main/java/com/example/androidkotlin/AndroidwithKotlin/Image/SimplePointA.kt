package com.example.androidkotlin.AndroidwithKotlin.Image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidkotlin.R

class SimplePointA : AppCompatActivity() {

    lateinit var canvasView: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_point)
        canvasView = findViewById(R.id.canvas)
    }

    fun ClearCanvas(view: View) {
        canvasView.ClearCanvas()
    }
}
