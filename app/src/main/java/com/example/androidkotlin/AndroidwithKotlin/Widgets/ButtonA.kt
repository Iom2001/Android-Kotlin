package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.androidkotlin.R

class ButtonA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        val buttonListener = findViewById<Button>(R.id.button1) as Button

        buttonListener.setOnClickListener {
            Toast.makeText(this, "By using OnClickListner", Toast.LENGTH_SHORT).show()
        }
    }

    fun buttonFunc(v: View) {
        if (v.id == R.id.button) {
            Toast.makeText(this, "By using OnClick attribute in XML", Toast.LENGTH_SHORT).show()
        }
    }
}
