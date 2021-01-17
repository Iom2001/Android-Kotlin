package com.example.androidkotlin.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.androidkotlin.R

class ImageAdapter(private val mContext: Context) : PagerAdapter() {

    companion object {
        val mImageArray = arrayOf(
            R.drawable.widgets,
            R.drawable.sqlite,
            R.drawable.notification,
            R.drawable.material,
            R.drawable.ttos
        )
    }

    override fun isViewFromObject(view: View, any: Any): Boolean {
        return view == any
    }

    override fun getCount(): Int {
        return mImageArray.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val mImageView = ImageView(mContext)
        mImageView.scaleType = ImageView.ScaleType.CENTER_CROP
        mImageView.setImageResource(mImageArray[position])
        container.addView(mImageView, 0)
        return mImageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, any: Any) {
        container.removeView(any as View?)
    }
}