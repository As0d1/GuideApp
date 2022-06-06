package com.dsu.guideapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.videoplayback);
        videoView2.setVideoURI(videoUri);
        videoView2.start();
        videoView2.setOnCompletionListener {
            videoView2.start();
        }

        infButton.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
            videoView2.visibility = View.INVISIBLE
        }

        hotelButton.setOnClickListener {
            val intent = Intent(this, HotelActivity::class.java)
            startActivity(intent)
            videoView2.visibility = View.INVISIBLE
        }
        eatButton.setOnClickListener {
            val intent = Intent(this, RestaurantActivity::class.java)
            startActivity(intent)
            videoView2.visibility = View.INVISIBLE
        }
        trsButton.setOnClickListener {
            val intent = Intent(this, Transportation::class.java)
            startActivity(intent)
            videoView2.visibility = View.INVISIBLE
        }
    }
}