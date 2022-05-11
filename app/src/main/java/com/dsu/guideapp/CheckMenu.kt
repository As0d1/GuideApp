package com.dsu.guideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_check_menu.*

class CheckMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_menu)

        val restName = intent.getStringExtra("restName")
        val menuData = intent.getStringExtra("menuData")

        txtMenuData.text = menuData.toString()

        if(restName == "gumbaza") {
            menuImg1.setImageResource(R.drawable.check_menu_gum)
            menuImg2.setImageResource(R.drawable.check_menu_gum2)
        }
        if(restName == "verando") {
            menuImg1.setImageResource(R.drawable.leverando)
            menuImg2.setImageResource(R.drawable.check_menu_gum2)
        }
    }
}
