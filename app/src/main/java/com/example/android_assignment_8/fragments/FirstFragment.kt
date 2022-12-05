package com.example.android_assignment_8.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.android_assignment_8.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<TextView>(R.id.textView1).text =
//            requireArguments().getString("NAME")
    }


}