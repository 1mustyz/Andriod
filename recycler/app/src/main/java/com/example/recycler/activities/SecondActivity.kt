package com.example.recycler.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recycler.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras
        val msg = bundle!!.getString("user_message")
        txvUserMessage.text = msg
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()


    }
}