package com.example.uidesignfive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uidesignfive.databinding.FragmentHomeBinding

class HomeFragment : Fragment(){
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentHomeBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val newsAdapter = NewsRecyclerAdapter()
        binding.rvNews.adapter = newsAdapter
        newsAdapter.submitList(listOf(
            NewsData("1","Browsing Bruges in Belgium",),
            NewsData("2","Covid-19 in the Airport"),
            NewsData("3","US-China War")
        ))
    }
}