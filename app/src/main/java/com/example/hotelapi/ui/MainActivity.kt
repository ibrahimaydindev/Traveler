package com.example.hotelapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelapi.R
import com.example.hotelapi.adapter.GridAdapter
import com.example.hotelapi.databinding.ActivityMainBinding
import com.example.hotelapi.models.GridModel


class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var gridAdapter: GridAdapter? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var arrayList: ArrayList<GridModel>? = null

    private lateinit var binding: ActivityMainBinding
    private lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        recyclerView = findViewById(R.id.gridView)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setData()
        gridAdapter = GridAdapter(applicationContext, arrayList!!)
        recyclerView?.adapter = gridAdapter
    }

    private fun setData(): ArrayList<GridModel> {
        val items: ArrayList<GridModel> = ArrayList()
        items.add(GridModel(R.drawable.grid_map, "Save Location"))
        items.add(GridModel(R.drawable.grid_news, "Read News"))
        items.add(GridModel(R.drawable.grid_exchange, "Exchange Rate"))
        items.add(GridModel(R.drawable.grid_chat, "Chat Room"))
        items.add(GridModel(R.drawable.qr_scanner, "QR Scanner"))
        items.add(GridModel(R.drawable.grid_weather, "Weather"))

        return items
    }
}