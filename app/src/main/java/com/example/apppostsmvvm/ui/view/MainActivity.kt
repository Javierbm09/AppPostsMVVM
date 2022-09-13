package com.example.apppostsmvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apppostsmvvm.databinding.ActivityMainBinding
import com.example.apppostsmvvm.ui.viewModel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private val quoteViewModel: QuoteViewModel by viewModels()

    private fun initRecyclerview(){
        binding.rvPosts.layoutManager = LinearLayoutManager(this)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerview()

        quoteViewModel.onCreate()
        linearLayoutManager = LinearLayoutManager(this)


        quoteViewModel.quoteModel.observe(this, Observer {
            binding.rvPosts.layoutManager = LinearLayoutManager(this)
        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.progress.isVisible=it
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }


}