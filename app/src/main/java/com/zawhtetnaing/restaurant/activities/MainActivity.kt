package com.zawhtetnaing.restaurant.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.restaurant.R
import com.zawhtetnaing.restaurant.adapters.FoodAdapter
import com.zawhtetnaing.restaurant.delegates.FoodListItemActionDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),FoodListItemActionDelegate {


    private lateinit var mAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()

        print("Hello Restaurants Animation")
    }

    private fun setUpRecyclerView() {
        mAdapter = FoodAdapter(this)
        with(rvFood) {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }

    override fun onTapFood() {
        startActivity(RestaurantDetailsActivity.newIntent(applicationContext))
    }

}
