package com.example.androidkotlin.AndroidwithKotlin.Widgets

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidkotlin.R


class CheckBox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        val click = findViewById<Button>(R.id.button)
        val checkOne = findViewById<CheckBox>(R.id.kotlin)
        val checkTwo = findViewById<CheckBox>(R.id.java)

        click.setOnClickListener {
            if (checkOne.isChecked && checkTwo.isChecked) {
                Toast.makeText(this, "Kotlin + Java", Toast.LENGTH_SHORT).show()
            } else if (checkTwo.isChecked) {
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()
            } else if (checkOne.isChecked) {
                Toast.makeText(this, "Kotlin", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
