package com.example.hotelapi.db

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hotelapi.models.Article

interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM articles")
    suspend fun getAllArticles():LiveData<List<Article>>

    @Query("DELETE FROM articles")
    suspend fun deleteAllArticles(article:Article)
}