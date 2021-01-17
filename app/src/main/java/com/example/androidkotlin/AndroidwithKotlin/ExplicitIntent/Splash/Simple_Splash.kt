package com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.androidkotlin.R

class Simple_Splash : AppCompatActivity() {

    internal val TIME_OUT = 1500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple__splash)


        Handler().postDelayed(
            {
                startActivity(Intent(this, DemoMain::class.java))
                finish()
            }, TIME_OUT.toLong()
        )
    }
}
