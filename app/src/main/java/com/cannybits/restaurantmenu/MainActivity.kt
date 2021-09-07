package com.cannybits.restaurantmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var foodList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodList.add(Food("Coffee","Kahawa ya Arabica inapatikana",R.drawable.coffee_pot))
        foodList.add(Food("Espresso","Espresso inapatikana pia",R.drawable.espresso))
        foodList.add(Food("French Fries","chips kavu",R.drawable.french_fries))
        foodList.add(Food("Honey","Asali tamu kutoka Tabora",R.drawable.honey))
        foodList.add(Food("Strawberry Ice Cream","Ice cream ya matunda ya straw berry",R.drawable.strawberry_ice_cream))
        foodList.add(Food("Sugar Cubes","Sukari guru ile yenyewe kabisa",R.drawable.sugar_cubes))
    }
}