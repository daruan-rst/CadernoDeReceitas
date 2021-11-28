package com.study.cadernodereceitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// uma splash activity é uma janela que contenha uma imagem, uma logo e a versão atual do software

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}