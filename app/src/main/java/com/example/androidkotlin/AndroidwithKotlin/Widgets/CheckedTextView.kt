package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import com.example.androidkotlin.R

class CheckedTextView : AppCompatActivity() {

    lateinit var checkedTextView: CheckedTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checked_text_view)

        checkedTextView = findViewById(R.id.checkedText)

        checkedTextView.setOnClickListener {

            checkedTextView.toggle()
        }
    }
}
