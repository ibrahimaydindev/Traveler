package com.example.hotelapi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelapi.R
import com.example.hotelapi.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}