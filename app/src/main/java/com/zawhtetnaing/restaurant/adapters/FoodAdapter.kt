package com.zawhtetnaing.restaurant.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.restaurant.R
import com.zawhtetnaing.restaurant.view.holders.FoodViewHolder

class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_food,parent,false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

    }
}