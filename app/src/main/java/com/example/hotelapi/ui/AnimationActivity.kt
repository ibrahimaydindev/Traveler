package com.example.hotelapi.ui

import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import com.example.hotelapi.databinding.ActivityAnimationBinding

class AnimationActivity : AppCompatActivity() {


    private lateinit var binding: ActivityAnimationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            Handler.createAsync(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)
        }


    }
}