package com.example.uidesignfive

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.uidesignfive.databinding.ItemNewsBinding

data class NewsData(
    val id : String,
    val name : String
)

class NewsRecyclerAdapter : ListAdapter<NewsData,NewsViewHolder> (NewsDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


}

class NewsViewHolder(private val binding : ItemNewsBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(data: NewsData){

        if(data.id == "1"){
            binding.ivNewsItem.setImageResource(R.drawable.pic1)
        }else if (data.id == "2"){
            binding.ivNewsItem.setImageResource(R.drawable.pic2)
        }else
            binding.ivNewsItem.setImageResource(R.drawable.pic3)

        binding.tvNewsItem.text = data.name
    }

}

object NewsDiffUtil:DiffUtil.ItemCallback<NewsData>(){
    override fun areItemsTheSame(oldItem: NewsData, newItem: NewsData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NewsData, newItem: NewsData): Boolean {
        return oldItem == newItem
    }

}