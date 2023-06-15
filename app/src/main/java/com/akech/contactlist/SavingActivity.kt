package com.akech.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akech.contactlist.databinding.ActivityMainBinding

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }





}


