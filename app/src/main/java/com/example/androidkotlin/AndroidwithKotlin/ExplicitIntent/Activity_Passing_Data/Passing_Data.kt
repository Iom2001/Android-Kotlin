package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Activity_Passing_Data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import com.example.androidkotlin.R

class Passing_Data : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing__data)
        val name = findViewById<EditText>(R.id.name_passing_data)
        val age = findViewById<EditText>(R.id.age_passing_data)
        val gender = findViewById<RadioGroup>(R.id.genderGroup)
        val submitButton = findViewById<Button>(R.id.submit_pass)

        submitButton.setOnClickListener {
            if (TextUtils.isEmpty(name.text.toString())) {
                name.error = "Enter Name.."
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(age.text.toString())) {
                age.error = "Enter Age.."
                return@setOnClickListener
            }
            val intent = Intent(this, Display::class.java)
            val bundle = Bundle()
            bundle.putString("name", name.text.toString())
            bundle.putString("age", age.text.toString())
            val gen_id = gender.checkedRadioButtonId
            if (gen_id == -1) {
                Toast.makeText(this, "Select Gender", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                val radioBotton = findViewById<RadioButton>(gen_id)
                val genValue = radioBotton.text.toString()
                bundle.putString("gender", genValue)
            }
            intent.putExtra("extras",bundle)
            startActivity(intent)
        }
    }
}
