package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import com.example.androidkotlin.R
import com.example.androidkotlin.adapters.ExpandableListviewAdapter

class ExpandableListViewA : AppCompatActivity() {

    val title : MutableList<String> = ArrayList()
    val subTitle : MutableList<MutableList<String>> = ArrayList()
    lateinit var expandableListView : ExpandableListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_list_view)

        expandableListView = findViewById(R.id.expandableListViewA)

        val diff_oceans : MutableList<String> = ArrayList()
        diff_oceans.add("Indian Oceans")
        diff_oceans.add("Arctic Oceans")
        diff_oceans.add("Atlantic Oceans")
        diff_oceans.add("Pacific Oceans")

        val diff_continent : MutableList<String> = ArrayList()
        diff_continent.add("Asia")
        diff_continent.add("Africa")
        diff_continent.add("Europe")
        diff_continent.add("North America")
        diff_continent.add("South America")
        diff_continent.add("Australia")
        diff_continent.add("Antarctica")

        title.add("Oceans")
        title.add("Continents")

        subTitle.add(diff_oceans)
        subTitle.add(diff_continent)

        expandableListView.setAdapter(ExpandableListviewAdapter(this,title,subTitle))
    }
}
