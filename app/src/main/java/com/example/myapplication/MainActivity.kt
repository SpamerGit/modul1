package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_new_activity = findViewById(R.id.btn_start_new_activity) as Button
        btn_new_activity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent);
        }
    }
}