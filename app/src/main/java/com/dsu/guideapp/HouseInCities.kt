package com.dsu.guideapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_house_in_cities.*

class HouseInCities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_in_cities)

        HouseTahskent.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }
        HouseSamarkand.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }
        HouseKhiva.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }
        HouseBukhara.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }
        HouseNamangan.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }
        HouseFergana.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }
    }
}