package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCount=findViewById<Button>(R.id.btnCount)
        var count=0
        btnCount.setOnClickListener {
            count++
            var tvCount=findViewById<TextView>(R.id.tvCount)
            tvCount.text="Lets Count together: $count"
        }
    }
}