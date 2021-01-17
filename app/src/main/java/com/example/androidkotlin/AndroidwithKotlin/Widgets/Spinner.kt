package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.androidkotlin.R

class Spinner : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val spin = findViewById<Spinner>(R.id.spinId)

        val fruits = arrayOf("Apple", "Orange", "Lime", "Grapes", "Strawberry", "Kiwi", "Mango")
        val ArrayAdp = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, fruits)
        spin.adapter = ArrayAdp
    }
}
