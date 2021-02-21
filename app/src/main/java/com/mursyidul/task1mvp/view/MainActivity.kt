package com.mursyidul.task1mvp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mursyidul.task1mvp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pangkat(view: View) {
        view.setOnClickListener {
            val intent = Intent(applicationContext,PangkatActivity::class.java)
            startActivity(intent)
        }
    }
    fun detik(view: View) {
        view.setOnClickListener {
            val intent = Intent(applicationContext,DetikActivity::class.java)
            startActivity(intent)
        }
    }
    fun faktorial(view: View) {
        view.setOnClickListener {
            val intent = Intent(applicationContext,FaktorialActivity::class.java)
            startActivity(intent)
        }
    }
}