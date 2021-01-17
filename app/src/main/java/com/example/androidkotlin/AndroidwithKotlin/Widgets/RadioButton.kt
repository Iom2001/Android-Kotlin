package com.example.androidkotlin.AndroidwithKotlin.Widgets

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioGroup
import com.example.androidkotlin.R

class RadioButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val background = findViewById<LinearLayout>(R.id.back)

        radio.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.red -> {
                    background.setBackgroundColor(Color.parseColor("#FF0000"))
                }
                R.id.green -> {
                    background.setBackgroundColor(Color.parseColor("#00FF00"))
                }
                R.id.blue -> {
                    background.setBackgroundColor(Color.parseColor("#0000FF"))
                }
            }
        }
    }
}
