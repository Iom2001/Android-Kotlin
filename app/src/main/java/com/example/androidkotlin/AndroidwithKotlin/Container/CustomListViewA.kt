package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.androidkotlin.R
import com.example.androidkotlin.adapters.CListAdapter
import com.example.androidkotlin.models.CList

class CustomListViewA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        val listView = findViewById<ListView>(R.id.imageCustom)

        val custom_list_data = ArrayList<CList>()

        val custom_list = CListAdapter(this, custom_list_data)

        custom_list_data.add(CList(R.drawable.date, "Date", "This is custom date"))
        custom_list_data.add(CList(R.drawable.calc, "Calculator", "This is custom calculator"))
        custom_list_data.add(CList(R.drawable.banim, "Animation", "This is custom animation"))
        custom_list_data.add(
            CList(
                R.drawable.im_intent,
                "Implicit Intent",
                "This is custom Implicit intent"
            )
        )
        custom_list_data.add(
            CList(
                R.drawable.ex_intent,
                "Explicit Intent",
                "This is Explicit Intent"
            )
        )
        custom_list_data.add(CList(R.drawable.time, "Time", "This is custom Time"))
        custom_list_data.add(CList(R.drawable.widgets, "Widgets", "This is custom Widgets"))

        listView.adapter = custom_list

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

                Toast.makeText(this, " Item Clicked:- $id", Toast.LENGTH_SHORT).show()

            }
    }
}
