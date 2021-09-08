package com.cannybits.restaurantmenu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.food_card.view.*

class MainActivity : AppCompatActivity() {

    var foodList = ArrayList<Food>()
    var adapter: FoodAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodList.add(Food("Coffee","Kahawa ya Arabica inapatikana",R.drawable.coffee_pot))
        foodList.add(Food("Espresso","Espresso inapatikana pia",R.drawable.espresso))
        foodList.add(Food("French Fries","chips kavu",R.drawable.french_fries))
        foodList.add(Food("Honey","Asali tamu kutoka Tabora",R.drawable.honey))
        foodList.add(Food("Strawberry Ice Cream","Ice cream ya matunda ya straw berry",R.drawable.strawberry_ice_cream))
        foodList.add(Food("Sugar Cubes","Sukari guru ile yenyewe kabisa",R.drawable.sugar_cubes))

        adapter = FoodAdapter(this, foodList)

        gvFoodList.adapter = adapter
    }

    class FoodAdapter : BaseAdapter{
        var foodList = ArrayList<Food>()
        var context: Context? = null

        constructor(context: Context, foodList:ArrayList<Food>):super(){
            this.context = context
            this.foodList = foodList
        }

        override fun getCount(): Int {
            return foodList.size
        }

        override fun getItem(position: Int): Any {
           return foodList[position]
        }

        override fun getItemId(position: Int): Long {
           return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val food = this.foodList[position]
            var inflater = context!!.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodView = inflater.inflate(R.layout.food_card,null)
            foodView.ivFoodImage.setImageResource(food.image!!)
            foodView.ivFoodImage.setOnClickListener{
                val intent = Intent(context, FoodDetails::class.java)
                intent.putExtra("name",food.name)
                intent.putExtra("desc",food.desc)
                intent.putExtra("image",food.image)
                context!!.startActivity(intent)
            }
            foodView.tvFoodName.text = food.name!!
            return foodView
        }
    }
}
