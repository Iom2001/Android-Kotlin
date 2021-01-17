package com.example.androidkotlin.AndroidwithKotlin.Toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.androidkotlin.R

class CustomToast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast)
        val btn = findViewById<Button>(R.id.buttontoast) as Button

        val layoutInflater: LayoutInflater = layoutInflater

        val viewLay =
            layoutInflater.inflate(R.layout.activity_custom_toast, findViewById(R.id.custom_layout))

        btn.setOnClickListener {

            val custom_toast = Toast.makeText(
                this,
                "Toast:Gravity.Top",
                Toast.LENGTH_SHORT
            )
            custom_toast.setGravity(Gravity.CENTER, 0, 0)
            custom_toast.view = viewLay
            custom_toast.show()

        }
    }
}
