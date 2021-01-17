package com.example.androidkotlin.AndroidwithKotlin.AlertDialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidkotlin.R

class TranditionalSingleChoiceA : AppCompatActivity() {

    lateinit var mAlertButton: Button
    val programming_lang = arrayOf("Kolin", "C", "C+", "Java", "Python", "JavaScript", "PHP", "C#")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tranditional_single_choice)
        mAlertButton = findViewById(R.id.btnAlert)
        mAlertButton.setOnClickListener {
            val mAlertDialogBuilder = AlertDialog.Builder(this)
            mAlertDialogBuilder.setTitle("This is title..")
            mAlertDialogBuilder.setIcon(R.mipmap.ic_launcher)
            mAlertDialogBuilder.setCancelable(false)
            mAlertDialogBuilder.setItems(programming_lang) { _, which ->
                when (which) {
                    which -> {
                        Toast.makeText(this, programming_lang[which], Toast.LENGTH_SHORT).show()
                    }
                }

            }
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
