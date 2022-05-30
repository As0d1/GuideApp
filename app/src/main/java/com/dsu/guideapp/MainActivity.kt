package com.dsu.guideapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
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
            videoView1.visibility = View.INVISIBLE
        }

        hotelButton.setOnClickListener {
            val intent = Intent(this, HotelActivity::class.java)
            startActivity(intent)
            videoView1.visibility = View.INVISIBLE
        }
        eatButton.setOnClickListener {
            val intent = Intent(this, RestaurantActivity::class.java)
            startActivity(intent)
            videoView1.visibility = View.INVISIBLE
        }
        trsButton.setOnClickListener {
            val intent = Intent(this, Transportation::class.java)
            startActivity(intent)
            videoView1.visibility = View.INVISIBLE
        }
    }
}