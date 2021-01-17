package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.core.view.MenuItemCompat
import com.example.androidkotlin.R

class SearchVeiwToolBarA : AppCompatActivity() {

    lateinit var mListView: ListView
    lateinit var mArrayAdapter: ArrayAdapter<String>
    val mArrayList = arrayOf(
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_veiw_tool_bar)
        mListView = findViewById(R.id.listViewSearch)
        mArrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mArrayList)
        mListView.adapter = mArrayAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_search, menu)
        val menuItem = menu!!.findItem(R.id.search_menu)
        val viewSearch = MenuItemCompat.getActionView(menuItem) as SearchView
        viewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                viewSearch.clearFocus()
                if (mArrayList.contains(query)) {
                    mArrayAdapter.filter.filter(query)
                } else {
                    Toast.makeText(this@SearchVeiwToolBarA, "Match Not Found", Toast.LENGTH_SHORT)
                        .show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                mArrayAdapter.filter.filter(
                    newText
                )
                return false
            }

        })

        return super.onCreateOptionsMenu(menu)
    }
}
