package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.androidkotlin.R

class CustomCheckbox : AppCompatActivity() {

    lateinit var mCheckBoxJava: android.widget.CheckBox
    lateinit var mCheckBoxKotlin: CheckBox
    lateinit var mSubmitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_checkbox)


        mCheckBoxJava = findViewById(R.id.checkbox_java)
        mCheckBoxKotlin = findViewById(R.id.checkbox_kotlin)
        mSubmitBtn = findViewById(R.id.submit_button)

        mSubmitBtn.setOnClickListener {

            val sb: StringBuilder = StringBuilder("")

            if (mCheckBoxJava.isChecked) {
                val str1 = mCheckBoxJava.text.toString()
                sb.append(str1)
            }

            if (mCheckBoxKotlin.isChecked) {
                val str2 = mCheckBoxKotlin.text.toString()
                sb.append("\n" + str2)
            }

            if (sb != null && sb.toString() != "") {
                Toast.makeText(this, sb, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show()
            }
        }
    }
}
