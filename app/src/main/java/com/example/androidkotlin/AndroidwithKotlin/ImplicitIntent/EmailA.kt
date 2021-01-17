package com.example.androidkotlin.AndroidwithKotlin.ImplicitIntent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidkotlin.R

class EmailA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val btn = findViewById<Button>(R.id.buttonEmail)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("Email")
            val str_array = arrayOf(
                "jokerprogrammer1@gmail.com",
                "jokerprogrammer2@gmail.com",
                "jokerprogrammer3@gmail.com"
            )
            intent.putExtra(Intent.EXTRA_EMAIL, str_array)
            intent.putExtra(Intent.EXTRA_SUBJECT, "This field is for subject")
            intent.putExtra(Intent.EXTRA_TEXT, "This field is for Email body")
            intent.type = "message/rfc822"
            startActivity(Intent.createChooser(intent, "Launch Email"))
        }
    }
}
