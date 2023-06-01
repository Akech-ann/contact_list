package com.akech.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akech.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    private fun displayContacts(){
        val con1=ContactData("","Akech","akechann@gmail.com","0732837873")
        val con2=ContactData("","Pauline","akech@gmail.com","0723837873")
        val con3=ContactData("","Ann","ann@gmail.com","0735437873")
        val con4=ContactData("","Montana","akecmotyn@gmail.com","07328342873")
        val con5=ContactData("","Atong","akecotisn@gmail.com","07324227873")
        val con6=ContactData("","Monty","akechann@gmail.com","0732837873")
        val con7=ContactData("","Monty","akechann@gmail.com","0732837873")
        val con8=ContactData("","Monty","akechann@gmail.com","0732837873")
        val contactList= listOf(con1,con2,con3,con4,con5,con6,con7,con8)
        val tvAdapter=ContactAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=tvAdapter

    }
}