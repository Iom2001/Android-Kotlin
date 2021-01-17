package com.example.androidkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.androidkotlin.R

class ExpandableListviewAdapter(
    var context: Context,
    var title: MutableList<String>,
    var subTitle: MutableList<MutableList<String>>
) : BaseExpandableListAdapter() {

    override fun getGroup(groupPosition: Int): Any {
        return title[groupPosition]
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = true

    override fun hasStableIds(): Boolean = false

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        if (convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.title_layout, null)
        }
        val mTitle = convertView!!.findViewById<TextView>(R.id.lv_title)
        mTitle.text = getGroup(groupPosition) as String
        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int = subTitle[groupPosition].size

    override fun getChild(groupPosition: Int, childPosition: Int): Any =
        subTitle[groupPosition][childPosition]

    override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        if (convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.subtitle_layout, null)
        }
        val mSubTitle = convertView!!.findViewById<TextView>(R.id.lv_subtitle)
        mSubTitle.text = getChild(groupPosition, childPosition) as String
        return convertView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long = childPosition.toLong()

    override fun getGroupCount(): Int = title.size

}