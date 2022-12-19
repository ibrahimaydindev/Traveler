package com.example.hotelapi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hotelapi.R
import com.example.hotelapi.databinding.ActivityNewsBinding
import com.example.hotelapi.db.ArticleDatabase
import com.example.hotelapi.repository.NewsRepository
import com.example.hotelapi.viewmodel.NewsViewModel
import com.example.hotelapi.viewmodel.NewsViewModelProviderFactory

class NewsActivity : AppCompatActivity() {
    lateinit var viewModel: NewsViewModel
    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[NewsViewModel::class.java]
        binding.bottomNavigationView.setupWithNavController(binding.newsNavHostFragment.findNavController())
    }
}