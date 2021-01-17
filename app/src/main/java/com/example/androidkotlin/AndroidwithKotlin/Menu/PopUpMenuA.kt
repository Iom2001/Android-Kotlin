package com.example.androidkotlin.AndroidwithKotlin.Menu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import com.example.androidkotlin.R

class PopUpMenuA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu)

        val btnPop = findViewById<Button>(R.id.buttonPop)
        val background = findViewById<LinearLayout>(R.id.backPop)
        btnPop.setOnClickListener {
            val popMenu = PopupMenu(this, btnPop)
            popMenu.menuInflater.inflate(R.menu.menu_pop, popMenu.menu)
            popMenu.setOnMenuItemClickListener(object :  PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {
                    when(item?.itemId) {
                        R.id.redColor -> {
                            background.setBackgroundColor(Color.parseColor("#FF0000"))
                        }
                        R.id.greenColor -> {
                            background.setBackgroundColor(Color.parseColor("#00FF00"))
                        }
                        R.id.blueColor -> {
                            background.setBackgroundColor(Color.parseColor("#0000FF"))
                        }
                    }
                    return true
                }
            })
            popMenu.show()
        }
    }
}
