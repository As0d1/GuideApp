package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tashkent_restaurant.*

class TashkentRestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tashkent_restaurant)

        citygrillmenu.setOnClickListener {
            val intent = Intent(this, citygrill_menu_page::class.java)
            startActivity(intent)


        }
        restaurantAfsana.setOnClickListener {
            val intent = Intent(this, Tashkent2menu::class.java)
            startActivity(intent)
        }

        btnMenuWeb.setOnClickListener {
            val intent = Intent(this, WebMenuActivity::class.java)
            intent.putExtra("link", "https://gruzinskiy.uz/menu/")
            startActivity(intent)
        }

        efendimenubtn.setOnClickListener {
            val intent = Intent(this, Efendimenu::class.java)
            startActivity(intent)


        }
    }
}