package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.androidkotlin.R

class ListViewA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val listView = findViewById<ListView>(R.id.list)
        val fruits = arrayOf(
            "Grapes",
            "Pineapple",
            "Apple",
            "Kiwi",
            "Mango",
            "Blueberry",
            "Strawberry",
            "Watermelon",
            "Orange",
            "Banana",
            "Guava",
            "Lime",
            "Avocado",
            "Papaya"
        )
        val adp: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
        listView.adapter = adp

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Item Clicked : $id", Toast.LENGTH_SHORT).show()
        }
    }
}
