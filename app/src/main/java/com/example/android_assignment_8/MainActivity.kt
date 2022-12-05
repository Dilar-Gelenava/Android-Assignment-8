package com.example.android_assignment_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.android_assignment_8.adapters.CarRecyclerAdapter
import com.example.android_assignment_8.adapters.ViewPagerFragmentAdapter
import com.example.android_assignment_8.models.Car
import com.example.android_assignment_8.repo.CarDBHelper
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var adapter: FragmentStateAdapter
    private lateinit var seedButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.viewPager2)
        tabLayout = findViewById(R.id.tabLayout)

        adapter = ViewPagerFragmentAdapter(this)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        initCarAdapter()
    }

    private fun initCarAdapter() {

        seedButton = findViewById(R.id.seedButton)
        seedButton.setOnClickListener {
            CarDBHelper(this).deleteAllCars()
            seedDatabase()
            setDataToRecyclerView()
        }

        setDataToRecyclerView()
    }

    private fun setDataToRecyclerView() {
        val allCars = CarDBHelper(this).getAllCars()
        val recyclerView = findViewById<RecyclerView>(R.id.carRecyclerView)
        val manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        val adapter = CarRecyclerAdapter(allCars)
        recyclerView.adapter = adapter
    }

    private fun seedDatabase() {
        val carsToInsert = arrayOf(
            Car(0, "BMW", 4.5f, 2018),
            Car(0, "Mercedes", 5.5f, 2017),
            Car(0, "Volvo", 6.5f, 2016),
            Car(0, "Ford", 7.5f, 2015),
            Car(0, "Fiat", 8.5f, 2014),
            Car(0, "Opel", 9.5f, 2013),
            Car(0, "Mazda", 10.5f, 2012),
            Car(0, "Toyota", 11.5f, 2011),
            Car(0, "Honda", 12.5f, 2010),
            Car(0, "Nissan", 13.5f, 2009),
            Car(0, "Mitsubishi", 14.5f, 2008),
            Car(0, "Suzuki", 15.5f, 2007),
            Car(0, "Kia", 16.5f, 2006),
            Car(0, "Hyundai", 17.5f, 2005),
            Car(0, "Chevrolet", 18.5f, 2004),
            Car(0, "Dodge", 19.5f, 2003),
        )

        CarDBHelper(this).apply {
            for (carToInsert in carsToInsert) {
                insertCar(carToInsert)
            }
        }
    }


}