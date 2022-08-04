package com.genius_koder.dogglers_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.genius_koder.dogglers_app.databinding.HorizontalListBinding


class HorizontalListActivity : AppCompatActivity() {

    private lateinit var binding: HorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        // Specify fixed size to improve performance
        binding.horizontalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}