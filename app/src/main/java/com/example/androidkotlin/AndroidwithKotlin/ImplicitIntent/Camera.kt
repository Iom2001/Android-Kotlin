package com.example.androidkotlin.AndroidwithKotlin.ImplicitIntent

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import com.example.androidkotlin.R

class Camera : AppCompatActivity() {

    private lateinit var cImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        val cBtn = findViewById<Button>(R.id.opencamera)
        cImg = findViewById(R.id.ImageCamera)
        cBtn.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, CAMERA_REQUEST)
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            val cPhoto = data!!.extras?.get("data") as Bitmap
            cImg.setImageBitmap(cPhoto)
        }
    }

    companion object {
        private val CAMERA_REQUEST = 123
    }
}
