package com.example.androidkotlin.AndroidwithKotlin.Time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import com.example.androidkotlin.R

class TimePickerA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        val time = findViewById<TimePicker>(R.id.timePicker)
        time.setOnTimeChangedListener { _, hourOfDay, minute ->
            Toast.makeText(this, "Time :- $hourOfDay : $minute", Toast.LENGTH_SHORT).show()
        }
    }
}
