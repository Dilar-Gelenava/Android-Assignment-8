package com.example.android_assignment_8.adapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android_assignment_8.fragments.FirstFragment
import com.example.android_assignment_8.fragments.SecondFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                val s = FirstFragment()
                val b = Bundle()
                b.putString("NAME", "Test")
//                s.arguments = b
                return s
            }
            1 -> SecondFragment()
            else -> throw Exception()
        }
    }

}