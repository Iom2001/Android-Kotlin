package com.example.androidkotlin.AndroidwithKotlin.Menu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import com.example.androidkotlin.R

class OptionMenu : AppCompatActivity() {

    lateinit var background : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
        background = findViewById(R.id.backOption)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item!!.itemId) {
            R.id.redColorO -> {
                background.setBackgroundColor(Color.parseColor("#FF0000"))
            }
            R.id.greenColorO -> {
                background.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            R.id.blueColorO -> {
                background.setBackgroundColor(Color.parseColor("#0000FF"))
            }
            R.id.textO -> {
                Toast.makeText(this, "This item will be shown always on the action bar", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

