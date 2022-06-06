package com.dsu.guideapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_check_menu.*

class verando_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verando_menu)

        val restName = intent.getStringExtra("restName")
        val menuData = intent.getStringExtra("menuData")

        txtMenuData.text = menuData.toString()

        if (restName == "verando") {
            menuImg1.setImageResource(R.drawable.leverando)
        }
    }
}