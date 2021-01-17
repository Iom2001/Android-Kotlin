package com.example.androidkotlin.AndroidwithKotlin.Toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import com.example.androidkotlin.R

class PositioningToastA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_positioning_toast)
        val bTop = findViewById<Button>(R.id.btn1)
        val bCenter = findViewById<Button>(R.id.btn2)
        val bBottom = findViewById<Button>(R.id.btn3)
        val bLeft = findViewById<Button>(R.id.btn4)
        val bRight = findViewById<Button>(R.id.btn5)
        val bTopLeft = findViewById<Button>(R.id.btn6)

        bTop.setOnClickListener {
            val toast = Toast.makeText(this, "Toast: Gravity.TOP", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

        bCenter.setOnClickListener {
            val toast = Toast.makeText(this, "Toast: Gravity.CENTER", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }

        bBottom.setOnClickListener {
            val toast = Toast.makeText(this, "Toast: Gravity.BOTTOM", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 0, 0)
            toast.show()
        }

        bLeft.setOnClickListener {
            val toast1 = Toast.makeText(this, "Toast: Gravity.LEFT", Toast.LENGTH_SHORT)
            toast1.setGravity(Gravity.LEFT, 0, 0)
            toast1.show()
        }
        bRight.setOnClickListener {
            val toast1 = Toast.makeText(this, "Toast: Gravity.RIGHT", Toast.LENGTH_SHORT)
            toast1.setGravity(Gravity.RIGHT, 0, 0)
            toast1.show()
        }

        bTopLeft.setOnClickListener {
            val toast1 = Toast.makeText(this, "Toast: Gravity.TOPLEFT", Toast.LENGTH_SHORT)
            toast1.setGravity(Gravity.TOP or Gravity.LEFT, 0, 0)
            toast1.show()
        }
    }
}
