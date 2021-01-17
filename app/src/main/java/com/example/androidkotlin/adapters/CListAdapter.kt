package com.example.androidkotlin.adapters

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.androidkotlin.R
import com.example.androidkotlin.models.CList

class CListAdapter(private val getContext: Context, private val customListItem: ArrayList<CList>) :
    ArrayAdapter<CList>(getContext, 0, customListItem) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listLayout = convertView
        val holder : ViewHolder

        if (listLayout == null) {
            val inflateList = (getContext as Activity).layoutInflater
            listLayout = inflateList!!.inflate(R.layout.custom_list, parent, false)
            holder = ViewHolder()
            holder.mTextViewOne = listLayout!!.findViewById(R.id.text1)
            holder.mTextViewTwo = listLayout!!.findViewById(R.id.text2)
            holder.mImageListView = listLayout!!.findViewById(R.id.CListImage)
            listLayout.tag = holder!!
        } else {
            holder = listLayout.tag as ViewHolder
        }
        val listItem = customListItem[position]
        holder.mTextViewOne!!.text = listItem.mCListTextOne
        holder.mTextViewTwo!!.text = listItem.mCListTextTwo
        holder.mImageListView!!.setImageResource(listItem.mCListImage)
        return listLayout
    }

    class ViewHolder {
        internal var mTextViewOne : TextView? = null
        internal var mTextViewTwo : TextView? = null
        internal var mImageListView : ImageView? = null
    }
}