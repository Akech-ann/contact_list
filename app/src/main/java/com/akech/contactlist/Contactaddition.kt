package com.akech.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akech.contactlist.databinding.ActivitySavingBinding
import com.akech.contactlist.databinding.ContactlistItemBinding

class Contactaddition : AppCompatActivity() {
    lateinit var binding: ContactlistItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ContactlistItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}