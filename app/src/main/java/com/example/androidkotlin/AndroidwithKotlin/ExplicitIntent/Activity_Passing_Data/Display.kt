package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Activity_Passing_Data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.androidkotlin.R

class Display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        val bundle = intent.extras
        val name = findViewById<TextView>(R.id.nameValue)
        val age = findViewById<TextView>(R.id.ageValue)
        val gender = findViewById<TextView>(R.id.genderValue)

        name.text = bundle!!.getCharSequence("name")
        age.text = bundle!!.getCharSequence("age")
        gender.text = bundle!!.getCharSequence("gender")

        val back = findViewById<Button>(R.id.back_passing)
        back.setOnClickListener {
            val intent = Intent(this, Passing_Data::class.java)
            startActivity(intent)
        }
    }
}
