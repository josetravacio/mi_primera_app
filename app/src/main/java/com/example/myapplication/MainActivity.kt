package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button)
        val myTextView: TextView = findViewById(R.id.textView)

        myButton.setOnClickListener {
            // Si el TextView está visible, ocúltalo; de lo contrario, muéstralo
            myTextView.visibility = if (myTextView.visibility == View.VISIBLE) {
                View.INVISIBLE
            } else {
                View.VISIBLE
            }
        }
    }
}
