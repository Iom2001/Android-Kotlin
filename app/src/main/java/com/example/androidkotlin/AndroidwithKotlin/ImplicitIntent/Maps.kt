package com.example.androidkotlin.AndroidwithKotlin.ImplicitIntent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidkotlin.R

class Maps : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val btn = findViewById<Button>(R.id.openMap)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("geo:19.1571699, 72.9982072")
            val intentChooser = Intent.createChooser(intent, "Launch Maps")
            startActivity(intentChooser)
        }
    }
}
