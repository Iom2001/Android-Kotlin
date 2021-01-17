package com.example.androidkotlin.AndroidwithKotlin.Widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import com.example.androidkotlin.R

class MultiAutoCompleteTextView : AppCompatActivity() {

    lateinit var multiAutoCompleteTextView: android.widget.MultiAutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_auto_complete_text_view)

        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteText)

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

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruitsArray)

        multiAutoCompleteTextView.setAdapter(arrayAdapter)

        multiAutoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

    }
}
