package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton
import com.example.androidkotlin.R

class ToggleButton : AppCompatActivity() {

    lateinit var mToggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        mToggleButton = findViewById(R.id.toggle_button)

        mToggleButton.setOnClickListener {

            if (mToggleButton.isChecked) {
                Toast.makeText(this, "Toggle Button:- ${mToggleButton.text}", Toast.LENGTH_SHORT)
                    .show()
                val img =
                    applicationContext.resources.getDrawable(R.drawable.ic_location_on_black_24dp)
                img.setBounds(0, 0, 60, 60)
                mToggleButton.setCompoundDrawables(img, null, null, null)

            } else {
                Toast.makeText(this, "Toggle Button:- ${mToggleButton.text}", Toast.LENGTH_SHORT)
                    .show()
                val img =
                    applicationContext.resources.getDrawable(R.drawable.ic_location_off_black_24dp)
                img.setBounds(0, 0, 60, 60)
                mToggleButton.setCompoundDrawables(img, null, null, null)

            }
        }
    }
}
