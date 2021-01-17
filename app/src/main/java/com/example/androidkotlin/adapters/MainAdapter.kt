package com.example.androidkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidkotlin.R
import com.example.androidkotlin.models.ThemeLearn
import kotlinx.android.synthetic.main.item.view.*

class MainAdapter(var list: List<ThemeLearn>, private var onItemClickListener:OnItemClickListener) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder (view: View): RecyclerView.ViewHolder(view){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.name.text = list[position].name
        holder.itemView.image.setImageResource(list[position].image)
        holder.itemView.setOnClickListener {

            onItemClickListener.onItemClickListener(holder.adapterPosition, list[position])
        }
    }
    interface OnItemClickListener {
        fun onItemClickListener(position: Int, themeLearn: ThemeLearn)
    }
}