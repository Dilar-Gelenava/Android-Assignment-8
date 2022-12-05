package com.example.android_assignment_8.dialogs

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.android_assignment_8.R

class CustomDialog(context: Context): Dialog(context) {
    lateinit var textView: TextView
    lateinit var button: Button

    init {
        setCancelable(false)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)

        button.setOnClickListener() {
            dismiss()
        }
    }
}