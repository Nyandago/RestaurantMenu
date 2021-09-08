package com.cannybits.restaurantmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*



class FoodDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val bundle: Bundle? = intent.extras

        val name = bundle!!.getString("name")
        val desc = bundle.getString("desc")
        val image = bundle.getInt("image")

        imgFood.setImageResource(image)
        tvNameFood.text = name
        tvDescFood.text = desc
    }
}