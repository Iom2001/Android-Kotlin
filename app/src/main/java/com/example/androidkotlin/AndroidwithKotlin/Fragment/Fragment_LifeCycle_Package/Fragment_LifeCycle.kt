package com.example.androidkotlin.AndroidwithKotlin.Fragment.Fragment_LifeCycle_Package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidkotlin.R

class Fragment_LifeCycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment__life_cycle)

    }
}
