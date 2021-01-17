package com.example.androidkotlin.AndroidwithKotlin.ImplicitIntent

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.androidkotlin.R
import kotlinx.android.synthetic.main.activity_text_view.*

class PhoneCallA : AppCompatActivity() {


    var editBtn : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_call)

        val callBtn = findViewById<Button>(R.id.buttonCall)
        editBtn = findViewById(R.id.buttonEdit)
        callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            val pNum = editBtn!!.text.toString()
            if (TextUtils.isEmpty(editBtn!!.text.toString())) {
                editBtn!!.error = "Enter Phone No"
                return@setOnClickListener
            }
            else {
                intent.data = Uri.parse("tel:$pNum")
            }
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Grant permission to call", Toast.LENGTH_SHORT).show()
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 1)
            } else {
                startActivity(intent)
            }
        }
    }
}
