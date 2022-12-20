package com.example.hotelapi.repository

import com.example.hotelapi.api.RetrofitInstance
import com.example.hotelapi.db.ArticleDatabase

class NewsRepository(val db : ArticleDatabase) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

}
