package com.example.androidkotlin.AndroidwithKotlin.AlertDialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidkotlin.R

class SingleChoiceListA : AppCompatActivity() {

    lateinit var mAlertButton: Button
    val programming_lang =
        arrayOf("Kotlin", "C", "C++", "Java", "Python", "JavaScript", "PHP", "C#")
    var checkedItem = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_choice_list)
        mAlertButton = findViewById(R.id.btnAlertR)
        mAlertButton.setOnClickListener {
            val mAlertDialogBuilder = AlertDialog.Builder(this)
            mAlertDialogBuilder.setTitle("This is title..")
            mAlertDialogBuilder.setIcon(R.mipmap.ic_launcher)
            mAlertDialogBuilder.setCancelable(false)
            mAlertDialogBuilder.setSingleChoiceItems(
                programming_lang,
                checkedItem
            ) { dialog, which ->
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
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
            }
            val mAlertDialog = mAlertDialogBuilder.create()
            mAlertDialog.show()
        }
    }
}
