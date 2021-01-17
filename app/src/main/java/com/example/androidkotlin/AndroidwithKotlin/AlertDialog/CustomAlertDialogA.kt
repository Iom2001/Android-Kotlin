package com.example.androidkotlin.AndroidwithKotlin.AlertDialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidkotlin.R

class CustomAlertDialogA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)

    }

    fun showAlert(v: View) {
        val inflator = layoutInflater
        val inflate_view = inflator.inflate(R.layout.custom_view, null)

        val userNameEdt = inflate_view.findViewById(R.id.userName) as EditText
        val userPassWordEdt = inflate_view.findViewById(R.id.password) as EditText
        val checkBoxToggle = inflate_view.findViewById(R.id.showPassCheck) as CheckBox
        checkBoxToggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userPassWordEdt.transformationMethod = PasswordTransformationMethod.getInstance()
            } else {
                userPassWordEdt.transformationMethod = null
            }
        }

        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Enter Details.")
        alertDialog.setView(inflate_view)
        alertDialog.setCancelable(false)
        alertDialog.setNegativeButton("Cancel") { dialog, which ->
            val userName = userNameEdt.text.toString()
            val userPass = userPassWordEdt.text.toString()

            Toast.makeText(this, "Cancel Button", Toast.LENGTH_SHORT).show()
        }

        alertDialog.setPositiveButton("Done") { dialog, which ->
            val userName = userNameEdt.text.toString()
            val userPass = userPassWordEdt.text.toString()
            Toast.makeText(this, "UserName: $userName Password: $userPass", Toast.LENGTH_SHORT)
                .show()
        }

        val dialog = alertDialog.create()
        dialog.show()
    }
}
