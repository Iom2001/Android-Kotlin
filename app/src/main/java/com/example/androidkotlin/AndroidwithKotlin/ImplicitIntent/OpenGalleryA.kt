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
import android.widget.Toast
import com.example.androidkotlin.R
import java.io.IOException

class OpenGalleryA : AppCompatActivity() {

    lateinit var mImageView : ImageView
    companion object {
        val SELECT_IMAGE_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_gallery)
        mImageView = findViewById(R.id.openPicture)
        val btnOpen = findViewById<Button>(R.id.openGa)
        btnOpen.setOnClickListener {
            val intent = Intent()
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(Intent.createChooser(intent, "Select Picture.."), SELECT_IMAGE_CODE)
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == SELECT_IMAGE_CODE && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                try {
                    val bitmap : Bitmap = MediaStore.Images.Media.getBitmap(application.contentResolver, data.data)
                    mImageView.setImageBitmap(bitmap)
                }
                catch (exp : IOException) {
                    exp.printStackTrace()
                }
            }
        }
        else if (requestCode == Activity.RESULT_CANCELED) {
            Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
        }
    }

}
