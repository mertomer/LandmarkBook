package com.mertomerbakar.learnlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mertomerbakar.learnlearn.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding .inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList= ArrayList<Landmark>()
        val pisa=Landmark("Pisa","Italy",R.drawable.pisa)
        val eiffel=Landmark("Eiffel","France",R.drawable.eiffel)
        val colosseum=Landmark("Colosseum","Italy",R.drawable.collesium)
        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colosseum)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter
/*
        //Adapter : Layout & data

        //Mapping
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter=adapter
        binding.listView.onItemClickListener=AdapterView.OnItemClickListener{parent,view,position,id->
            val intent=Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            startActivity(intent)

            }*/

        }

    }

