package com.example.android_assignment_8.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.android_assignment_8.R

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<TextView>(R.id.textView2).text =
//            requireArguments().getString("NAME")

//        view.findViewById<Button>(R.id.button).setOnClickListener {

//            CustomDialog(requireContext()).show()

//            AlertDialog.Builder(requireContext())
//                .setTitle("Wanna transfer?")
//                .setMessage("U sure?")
//                .setPositiveButton("Yeah") { dialog, i ->
//                    Toast.makeText(requireContext(), "Cool!", Toast.LENGTH_SHORT).show()
//                    dialog.dismiss()
//                }
//                .setNegativeButton("Nea") { dialog, i ->
//                    Toast.makeText(requireContext(), "Really?", Toast.LENGTH_SHORT).show()
//                    dialog.dismiss()
//                }
//                .setNeutralButton("I dunno") { dialog, i ->
//                    Toast.makeText(requireContext(), "Hmmm", Toast.LENGTH_SHORT).show()
//                    dialog.dismiss()
//                }.show().setCancelable(false)
////                .setCanceledOnTouchOutside(false)

//        }
    }

}