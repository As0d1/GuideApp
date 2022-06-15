package com.dsu.guideapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class mountains : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mountains)

        title = "Mountains in Uzbekistan"
    }
}