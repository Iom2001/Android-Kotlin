package com.example.androidkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidkotlin.R
import com.example.androidkotlin.models.LateClick
import kotlinx.android.synthetic.main.item_simple2.view.*

class SecondAdapter(val list:List<LateClick>, val type: Boolean, private val onItemClickListener:
OnItemClickListener, private val onButtonClickListener: OnButtonClickListener):RecyclerView.Adapter<SecondAdapter.ViewHolder>(){


    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondAdapter.ViewHolder {

     return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_simple2,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: SecondAdapter.ViewHolder, position: Int) {
        holder.itemView.textname.text = list[position].text1

        if (type) holder.itemView.run.visibility = View.INVISIBLE

        holder.itemView.setOnClickListener {
            onItemClickListener.onItemClickListener(position, list[position])
        }
        holder.itemView.run.setOnClickListener {
            onButtonClickListener.onButtonClickListener(position)
        }
    }
    interface OnItemClickListener {
        fun onItemClickListener(position: Int, lateClick: LateClick)
    }

    interface OnButtonClickListener {
        fun onButtonClickListener(position: Int)
    }
}