package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidkotlin.R

class Switch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
        val swt = findViewById<android.widget.Switch>(R.id.switchId)

        swt.setOnClickListener {
            if (swt.isChecked)
                Toast.makeText(this, "Switch ON", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Switch OFF", Toast.LENGTH_SHORT).show()
        }
    }
}
