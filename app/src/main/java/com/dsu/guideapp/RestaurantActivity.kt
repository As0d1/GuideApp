package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_restaurant.*

class RestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        title = "Restaurants"

        infdowntown.setOnClickListener {
            val intent = Intent(this, DowntownRestaurant::class.java)
            startActivity(intent)
        }
        btnNearMountain.setOnClickListener {
            val intent = Intent(this, restauranrtnearmountain::class.java)
            startActivity(intent)
        }
    }
}