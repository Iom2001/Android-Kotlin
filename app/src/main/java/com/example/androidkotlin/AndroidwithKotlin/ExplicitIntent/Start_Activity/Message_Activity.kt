package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Start_Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidkotlin.R
import kotlinx.android.synthetic.main.activity_message_.*

class Message_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_)
    }


    fun submitMessage(view: View) {
        val messageEdt = message_edit.text.toString()
        val returnBackIntent = Intent()
        returnBackIntent.putExtra("result", messageEdt)
        setResult(Activity.RESULT_OK, returnBackIntent)
        finish()
    }
}
