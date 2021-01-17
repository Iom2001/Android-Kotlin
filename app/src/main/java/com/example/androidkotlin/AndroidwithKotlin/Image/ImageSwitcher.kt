package com.example.androidkotlin.AndroidwithKotlin.Image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import com.example.androidkotlin.R

class ImageSwitcher : AppCompatActivity() {

    lateinit var imageSwitcher: ImageSwitcher
    lateinit var btnNext: Button
    lateinit var btnBack: Button
    lateinit var arrImage: IntArray
    var position = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_switcher)

        imageSwitcher = findViewById(R.id.imageSwitcher)
        btnNext = findViewById(R.id.nextButton)
        btnBack = findViewById(R.id.backButton)

        arrImage = intArrayOf(
            R.drawable.widgets,
            R.drawable.sqlite,
            R.drawable.notification,
            R.drawable.material,
            R.drawable.ttos
        )
        imageSwitcher.setFactory {
            val imageView = ImageView(applicationContext)
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView
        }

        imageSwitcher.setImageResource(R.drawable.widgets)
        btnBack.setOnClickListener {
            if (position > 0) {
                position -= 1
                imageSwitcher.setImageResource(arrImage[position])
            }
        }
        btnNext.setOnClickListener {
            if (position < arrImage.size - 1) {
                position += 1
                imageSwitcher.setImageResource(arrImage[position])
            }
        }
    }
}