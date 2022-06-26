package com.dsu.guideapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hotel_in_cities.*
import kotlinx.android.synthetic.main.activity_house_in_cities.*

class HotelInCities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_in_cities)

        HotelTahskent.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }
        HotelSamarkand.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }
        HotelKhiva.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }
        HotelBukhara.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }
        HotelNamangan.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }
        HotelFergana.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }
    }
}