package com.example.androidkotlin.AndroidwithKotlin.Fragment.Fragment_LifeCycle_Package

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidkotlin.R


class FrameLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
    }

    fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(this, "onCreateView function called", Toast.LENGTH_SHORT).show()
        return inflater!!.inflate(R.layout.activity_frame_layout, container, false)
    }
}
