package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
import com.example.androidkotlin.R

class GridViewA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        val gridView = findViewById<GridView>(R.id.grid)

        val numbers = arrayOf(
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen",
            "Twenty"
        )

        val NumberAdp: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers)
        gridView.adapter = NumberAdp
        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Item Clicked : $id", Toast.LENGTH_SHORT).show()
        }
    }
}
