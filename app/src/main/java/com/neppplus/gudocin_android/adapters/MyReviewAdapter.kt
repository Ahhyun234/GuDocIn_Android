package com.neppplus.gudocin_android.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.gudocin_android.R
import com.neppplus.gudocin_android.datas.ReviewData

class MyReviewAdapter(

    val mContext : Context,
    val mList : List<ReviewData>) : RecyclerView.Adapter<MyReviewAdapter.ReviewViewHolder>() {

    inner class ReviewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : MyReviewAdapter.ReviewViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.my_review_list_item,parent, false)
        return ReviewViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyReviewAdapter.ReviewViewHolder, position: Int) {

    }

    override fun getItemCount() = mList.size
}