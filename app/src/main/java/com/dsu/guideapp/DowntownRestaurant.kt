package com.dsu.guideapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_downtown_restaurant.*

class DowntownRestaurant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downtown_restaurant)

        lyAndijan.setOnClickListener {
            val intent = Intent(this, AndijanActivity::class.java)
            startActivity(intent)
        }
        lyBukhara.setOnClickListener {
            val intent = Intent(this, Bukhara_restaurant::class.java)
            startActivity(intent)
        }
        lyJizzakh.setOnClickListener {
            val intent = Intent(this, jizzakh_Restaurant::class.java)
            startActivity(intent)
        }
        greedNamangan.setOnClickListener {
            val intent = Intent(this, namangan_restaurants::class.java)
            startActivity(intent)
        }
        welTahskent.setOnClickListener {
            val intent = Intent(this, TashkentRestaurantActivity::class.java)
            startActivity(intent)
        }
        lyFergana.setOnClickListener {
            val intent = Intent(this, FerganaRestaurantActivity::class.java)
            startActivity(intent)
        }


    }
}