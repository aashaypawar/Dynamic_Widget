package com.example.widget_withoutconfigure

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.wifi.WifiConfiguration.AuthAlgorithm.strings
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

    }
}