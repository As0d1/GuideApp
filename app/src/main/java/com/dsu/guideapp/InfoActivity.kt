package com.dsu.guideapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        title = "Culture & Geography"

        cvHolidays.setOnClickListener {
            startActivity(Intent(this, Boysun_bahori_festival::class.java))
        }
        cvHistorical.setOnClickListener {
            startActivity(Intent(this, historical_places::class.java))
        }
        cvMountains.setOnClickListener {
            startActivity(Intent(this, mountains::class.java))
        }

    }
}