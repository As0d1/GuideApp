package com.dsu.guideapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class historical_places : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historical_places)

        title = "Historical Sights"
    }
}