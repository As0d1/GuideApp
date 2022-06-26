package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hotel.*

class HotelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)

        title = "Hotel & House Rental"

        btnHouse.setOnClickListener {
            startActivity(Intent(this, HouseInCities::class.java))
        }

        btnHotel.setOnClickListener {
            startActivity(Intent(this, HotelInCities::class.java))
        }

    }
}