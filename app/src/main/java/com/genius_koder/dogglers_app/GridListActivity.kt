package com.genius_koder.dogglers_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.genius_koder.dogglers_app.databinding.GridListBinding

class GridListActivity : AppCompatActivity() {
    private lateinit var binding: GridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}