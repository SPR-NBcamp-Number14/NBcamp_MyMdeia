package com.example.mymedia.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymedia.R
import com.example.mymedia.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() = with(binding){

    }
}