package com.example.androidkotlin.AndroidwithKotlin.Widgets

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidkotlin.R

class ProgressDialog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_dialog)

        val prgDialog = ProgressDialog(this)

        val startBtn = findViewById<Button>(R.id.start)

        startBtn.setOnClickListener {
            prgDialog.setTitle("Progress Dialog")
            prgDialog.setMessage("This is progress Dialog Box\n Click on the screen to dismiss")
            prgDialog.show()
        }

    }
}
