package com.example.androidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

class ReadtxtActivity : AppCompatActivity() {
    lateinit var stringBuilder: StringBuilder
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_readtxt)
        textView = findViewById(R.id.codetext)
        val txtfile = intent.getSerializableExtra("txt") as String

        try {
            var reader: BufferedReader? = null
            reader = BufferedReader(InputStreamReader(assets.open(txtfile)))
            var line: String? = null
            stringBuilder = StringBuilder()
            while ({ line = reader.readLine();line }() != null) {
                stringBuilder.append(line + "\n")
            }
            textView.text = stringBuilder
        } catch (exp: Exception) {
            exp.printStackTrace()
        }
    }
}
