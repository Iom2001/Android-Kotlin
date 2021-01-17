package com.example.androidkotlin.AndroidwithKotlin.Wifi_Manager

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.androidkotlin.R

class WifiStateChange : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifi_state_change)

        val btnWifiOn = findViewById<Button>(R.id.wifion)
        val btnWifiOff = findViewById<Button>(R.id.wifioff)
        btnWifiOn.setOnClickListener {
            val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.isWifiEnabled = true
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show()
        }
        btnWifiOff.setOnClickListener {
            val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.isWifiEnabled = false
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show()
        }
    }
}
