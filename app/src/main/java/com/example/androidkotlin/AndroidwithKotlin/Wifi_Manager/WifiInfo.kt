package com.example.androidkotlin.AndroidwithKotlin.Wifi_Manager

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.androidkotlin.R

class WifiInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifi_info)
        val wifiButton = findViewById<Button>(R.id.button_Wifi)
        val btnText = findViewById<TextView>(R.id.wifi_List)
        wifiButton.setOnClickListener {
            val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            val wifiInfo = wifiManager.connectionInfo
            val ipAddress = wifiInfo.ipAddress
            val bssid = wifiInfo.ssid
            val macAddress = wifiInfo.macAddress
            val linkSpeed = wifiInfo.linkSpeed
            val rssi = wifiInfo.rssi
            val networkId = wifiInfo.networkId
            val ipAdressFormat = android.text.format.Formatter.formatIpAddress(ipAddress)
            val wifiListInfo = "IP Address:- $ipAdressFormat\nBSSID:- $bssid\nMAC Address:- $macAddress\nSSID:- $bssid" +
                    "\nLink Speed:- $linkSpeed\nRSSI:- $rssi\nNetwork Id:- $networkId"
            btnText.text = wifiListInfo
        }
    }
}
