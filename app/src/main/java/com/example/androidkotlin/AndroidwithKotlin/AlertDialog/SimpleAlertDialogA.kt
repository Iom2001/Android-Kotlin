package com.example.androidkotlin.AndroidwithKotlin.AlertDialog

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.androidkotlin.R


class SimpleAlertDialogA : AppCompatActivity() {

    lateinit var mAlertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_alert_dialog)
        mAlertButton = findViewById(R.id.btnAlert)
        mAlertButton.setOnClickListener {
            val mAlertDialogBuilder = AlertDialog.Builder(this)
            mAlertDialogBuilder.setTitle("This is Title..")
            mAlertDialogBuilder.setIcon(R.mipmap.ic_launcher)
            mAlertDialogBuilder.setMessage("Are you sure do you want to exit?")
            mAlertDialogBuilder.setCancelable(false)
            mAlertDialogBuilder.setPositiveButton("Yes") { _, _ ->
                finish()
            }
            mAlertDialogBuilder.setNegativeButton("NO") { _, _ ->
                Toast.makeText(this, "Clicked No Button", Toast.LENGTH_SHORT).show()
            }
            mAlertDialogBuilder.setNeutralButton("Cancel") { _, _ ->
                Toast.makeText(this, "Clicked Cancel Button", Toast.LENGTH_SHORT).show()
            }
            val mAlertDialog = mAlertDialogBuilder.create()
            mAlertDialog.show()
        }
    }
}
