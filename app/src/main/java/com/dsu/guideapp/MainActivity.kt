package com.dsu.guideapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.travel );
        videoView1.setVideoURI(videoUri);
        videoView1.start();
        videoView1.setOnCompletionListener {
            videoView1.start();
        }

        infButton.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }

        hotelButton.setOnClickListener {
            val intent = Intent(this, HotelActivity::class.java)
            startActivity(intent)
        }
        eatButton.setOnClickListener {
            val intent = Intent(this, RestaurantActivity::class.java)
            startActivity(intent)
        }
        trsButton.setOnClickListener {
            val intent = Intent(this, Transportation::class.java)
            startActivity(intent)
        }
    }
}