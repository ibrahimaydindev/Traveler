package com.example.hotelapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hotelapi.databinding.RowLayoutBinding
import com.example.hotelapi.models.Article


class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {
    inner class ArticleViewHolder(val binding: RowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val differCallBack = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem

        }
    }
    val differ = AsyncListDiffer(this, differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = differ.currentList[position]
        holder.binding.apply {
            Glide.with(holder.itemView).load(article.urlToImage).into(ivArticleImage)
            tvSource.text = article.source.name
            tvTitle.text = article.title
            tvDescription.text = article.description
            tvPublishedAt.text = article.publishedAt
            root.setOnClickListener {
                onItemClickListener?.let { it(article) }
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((Article) -> Unit)? = null

    private fun setOnItemClickListener(listener: (Article) -> Unit) {
        onItemClickListener = listener
    }
}