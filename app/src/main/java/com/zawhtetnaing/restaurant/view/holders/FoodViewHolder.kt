package com.zawhtetnaing.restaurant.view.holders

import android.graphics.Bitmap
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions
import com.zawhtetnaing.restaurant.R
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.view_item_food.view.*

class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        Glide.with(itemView)
                .load(R.drawable.french_fries)
                .apply(RequestOptions.bitmapTransform(MultiTransformation<Bitmap>(
                        CenterCrop(),
                        RoundedCornersTransformation(32, 0, RoundedCornersTransformation.CornerType.TOP_RIGHT),
                        RoundedCornersTransformation(32, 0, RoundedCornersTransformation.CornerType.TOP_LEFT)
                        )))
                .into(itemView.ivFood)
    }
}
