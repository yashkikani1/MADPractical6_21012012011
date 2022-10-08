package com.example.madpractical6_21012012011

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeid="uznj0b6lOco"
        val mywebview=findViewById<WebView>(R.id.wv)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}