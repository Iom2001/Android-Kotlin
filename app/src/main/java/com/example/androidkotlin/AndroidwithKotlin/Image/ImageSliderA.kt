package com.example.androidkotlin.AndroidwithKotlin.Image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.androidkotlin.R
import com.example.androidkotlin.adapters.ImageAdapter

class ImageSliderA : AppCompatActivity() {

    lateinit var mViewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_slider)
        mViewPager = findViewById(R.id.viewPager)
        val mImageAdapter = ImageAdapter(this)
        mViewPager.adapter = mImageAdapter
    }
}
