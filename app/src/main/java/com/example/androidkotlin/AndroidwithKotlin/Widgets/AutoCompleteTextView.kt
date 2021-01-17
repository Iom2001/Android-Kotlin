package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.androidkotlin.R

class AutoCompleteTextView : AppCompatActivity() {

    lateinit var autoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_text_view)

        autoCompleteTextView = findViewById(R.id.autoCompleteText)

        val fruitsArray = arrayOf(
            "Apple",
            "Orange",
            "Mango",
            "Kiwi",
            "Berry",
            "Peach",
            "Banana",
            "Fig",
            "Strawberry",
            "Plum",
            "Raspberry",
            "Watermelon",
            "Blackberry",
            "Guava",
            "Grapes",
            "Pineapple",
            "Coconut",
            "Pear",
            "Papaya",
            "Apricot",
            "Avocado",
            "Cranberry",
            "Gooseberry",
            "Pineberry",
            "Star fruit",
            "Lime",
            "Date",
            "Passion fruit",
            "Dragon fruit"
        )

        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruitsArray)

        autoCompleteTextView.setAdapter(arrayAdapter)
    }
}
