package com.genius_koder.dogglers_app

import android.app.ListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vclicked = findViewById<Button>(R.id.vertical_btn)
        vclicked.setOnClickListener{ launchVertical() }

        val hclicked = findViewById<Button>(R.id.horizontal_btn)
        hclicked.setOnClickListener{ launchHorizontal() }

        val gclicked = findViewById<Button>(R.id.grid_btn)
        gclicked.setOnClickListener{ launchGrid() }
    }

    private fun launchVertical() {
        startActivity(Intent(this,VerticalListActivity::class.java))
    }

    private fun launchHorizontal() {
        startActivity(Intent(this,HorizontalListActivity::class.java))
    }

    private fun launchGrid() {
        startActivity(Intent(this,GridListActivity::class.java))
    }

}