package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import com.example.androidkotlin.R

class SearchViewA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)

        val search = findViewById<SearchView>(R.id.searchView)
        val list = findViewById<ListView>(R.id.listViewS)
        val countries = arrayOf(
            "India",
            "USA",
            "China",
            "Sri Lanka",
            "Ireland",
            "Germany",
            "Israel",
            "France",
            "Nepal",
            "Brazil",
            "Australia",
            "England",
            "Japan",
            "Pakistan"
        )
        val countryAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        list.adapter = countryAdapter

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                countryAdapter.filter.filter(newText)
                return false
            }

        })
    }
}
