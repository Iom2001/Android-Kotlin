package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Start_Activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidkotlin.R
import kotlinx.android.synthetic.main.activity_start_.*

class Start_Activity : AppCompatActivity() {

    val REQUEST_CODE_FOR_MESSAGE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_)



    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE_FOR_MESSAGE && resultCode == Activity.RESULT_OK) {
            val message = data!!.getStringExtra("result")
            defaultMessage.text = message
        }
    }

    fun getMessage(view: View) {
            val intent = Intent(this, Message_Activity::class.java)
            startActivityForResult(intent, REQUEST_CODE_FOR_MESSAGE)
    }
}
