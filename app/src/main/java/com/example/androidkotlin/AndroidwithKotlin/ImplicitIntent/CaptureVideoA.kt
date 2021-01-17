package com.example.androidkotlin.AndroidwithKotlin.ImplicitIntent

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.example.androidkotlin.R

class CaptureVideoA : AppCompatActivity() {

    lateinit var mVideoView : VideoView

    companion object {
        val CAPTURE_VIDEO_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_video)
        val btnCapture = findViewById<Button>(R.id.captureVideo)
        btnCapture.setOnClickListener {
            mVideoView = findViewById(R.id.videoView)
            val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivityForResult(intent, CAPTURE_VIDEO_CODE)
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CAPTURE_VIDEO_CODE && resultCode == Activity.RESULT_OK) {
            val videoUri = data!!.data
            mVideoView.setVideoURI(videoUri)
            mVideoView.setMediaController(MediaController(this))
            mVideoView.requestFocus()
            mVideoView.start()
        }
    }
}
