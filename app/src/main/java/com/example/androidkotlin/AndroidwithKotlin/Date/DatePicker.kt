package com.example.androidkotlin.AndroidwithKotlin.Date

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import com.example.androidkotlin.R
import java.util.*

class DatePicker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)
        val date = findViewById<DatePicker>(R.id.datePick)
        val calendar = Calendar.getInstance()
        date.init(
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        ) { _, _, _, _ ->
            Toast.makeText(
                this,
                "#" + date.dayOfMonth + "-" + date.month + "-" + date.year + "#",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
