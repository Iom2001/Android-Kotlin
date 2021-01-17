package com.example.androidkotlin.AndroidwithKotlin.Container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.androidkotlin.R

class WebViewA : AppCompatActivity() {

    lateinit var mwebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        mwebView = findViewById(R.id.webView)
        mwebView.loadUrl("http://www.google.com")
        val webString = mwebView.settings
        webString.javaScriptEnabled = true
        mwebView.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
        if (mwebView.canGoBack()) {
            mwebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
