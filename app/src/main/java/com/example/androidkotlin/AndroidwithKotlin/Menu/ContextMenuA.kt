package com.example.androidkotlin.AndroidwithKotlin.Menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.androidkotlin.R

class ContextMenuA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)
        val listColor = findViewById<ListView>(R.id.listContext)
        val color = arrayOf(
            "Red",
            "Blue",
            "Green",
            "Black",
            "Orange",
            "Magenta",
            "White",
            "Violet",
            "Yellow"
        )
        val colorAdap: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, color)
        listColor.adapter = colorAdap
        registerForContextMenu(listColor)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menu!!.add(0, v!!.id, 0, "Item 1")
        menu.add(0, v.id, 0, "Item 2")
        menu.add(0, v.id, 0, "Item 3")
        menu.add(0, v.id, 0, "Item 4")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.title) {
            "Item 1" -> {
                Toast.makeText(this, "Item 1 was selected", Toast.LENGTH_SHORT).show()
            }
            "Item 2" -> {
                Toast.makeText(this, "Item 2 was selected", Toast.LENGTH_SHORT).show()
            }
            "Item 3" -> {
                Toast.makeText(this, "Item 3 was selected", Toast.LENGTH_SHORT).show()
            }
            "Item 4" -> {
                Toast.makeText(this, "Item 4 was selected", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}
