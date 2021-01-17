package com.example.androidkotlin.AndroidwithKotlin.Time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import com.example.androidkotlin.R

class Chronometer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronometer)
        val chmeter = findViewById<Chronometer>(R.id.chrono)
        val startBtn = findViewById<Button>(R.id.start)
        val stopBtn = findViewById<Button>(R.id.stop)

        startBtn.setOnClickListener {
            chmeter.base = SystemClock.elapsedRealtime()
            chmeter.start()
        }
        stopBtn.setOnClickListener {
            chmeter.stop()
        }
    }
}
