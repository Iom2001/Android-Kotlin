package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import com.example.androidkotlin.R

class TextSwitcher : AppCompatActivity() {

    lateinit var textSwitcher: TextSwitcher
    lateinit var buttonNext: Button
    lateinit var buttonBack: Button
    val textArray = arrayOf(
        "TextView 1",
        "TextView 2",
        "TextView 3",
        "TextView 4",
        "TextView 5",
        "TextView 6",
        "TextView 7"
    )
    var pos: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_switcher)

        textSwitcher = findViewById(R.id.textSwitcher)
        buttonNext = findViewById(R.id.next)
        buttonBack = findViewById(R.id.back)

        textSwitcher.setFactory {
            val textView = TextView(this@TextSwitcher)
            textView.textSize = 20F
            textView.gravity = Gravity.CENTER
            textView
        }

        buttonBack.setOnClickListener {

            if (pos > 0) {
                pos -= 1
                textSwitcher.setText(textArray[pos])
            }

        }

        buttonNext.setOnClickListener {

            if (pos < textArray.size - 1) {
                pos += 1
                textSwitcher.setText(textArray[pos])
            }
        }
    }
}
