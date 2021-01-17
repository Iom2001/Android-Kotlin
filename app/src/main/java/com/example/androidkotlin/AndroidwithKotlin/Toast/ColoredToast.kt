package com.example.androidkotlin.AndroidwithKotlin.Toast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.androidkotlin.R

class ColoredToast : AppCompatActivity() {

    lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colored_toast)

        mButton = findViewById(R.id.btn)

        mButton.setOnClickListener {

            val mToast = Toast.makeText(this, "This is Toast..", Toast.LENGTH_LONG)

            val view = mToast.view

            view.setBackgroundResource(R.drawable.toast_background)

            val mToastText = mToast.view.findViewById<TextView>(android.R.id.message)

            mToastText.setTextColor(Color.parseColor("#FFFFFF"))
            mToast.show()
        }
    }
}
