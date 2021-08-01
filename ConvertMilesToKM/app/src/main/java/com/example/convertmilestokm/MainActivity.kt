package com.example.convertmilestokm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMilesToKm.setOnClickListener {

            val textMiles = editTextMiles.text.toString()
            Log.i("MainActivity", textMiles)
            val convertKm = textMiles.toDouble() / 0.62137
            editTextKM.setText(convertKm.toString())
//            txvMiles.visibility = INVISIBLE
        }

        btnKmToMiles.setOnClickListener {
            Log.i("MainActivity", "clicked2")
            val textKm = editTextKM.text.toString()
            val convertMiles = textKm.toDouble() * 0.62137
            editTextMiles.setText(convertMiles.toString())
        }
    }
}