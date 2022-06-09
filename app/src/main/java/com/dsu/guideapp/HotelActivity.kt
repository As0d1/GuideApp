package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hotel.*

class HotelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)


        btnHouse.setOnClickListener {
            startActivity(Intent(this, HousesActivity::class.java))
        }

        btnHotel.setOnClickListener {
            startActivity(Intent(this, Hotels_In_Uzbekistan::class.java))
        }

    }
}