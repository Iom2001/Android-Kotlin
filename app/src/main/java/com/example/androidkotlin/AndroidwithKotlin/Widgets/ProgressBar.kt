package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidkotlin.R

class ProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        val prgBarHorizontal = findViewById<android.widget.ProgressBar>(R.id.prgBar)
        val startBtn = findViewById<Button>(R.id.start)

        startBtn.setOnClickListener {
            var barStatus = 0
            Thread(Runnable {
                while (barStatus < 100) {
                    barStatus += 1

                    try {
                        Thread.sleep(20)
                        prgBarHorizontal.progress = barStatus
                    } catch (exp: InterruptedException) {
                        exp.printStackTrace()
                    }

                }
            }).start()
        }
    }
}
