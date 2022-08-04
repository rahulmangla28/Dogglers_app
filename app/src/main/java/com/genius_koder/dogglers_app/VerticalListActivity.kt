package com.genius_koder.dogglers_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.genius_koder.dogglers_app.databinding.VerticalListBinding


class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding: VerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = VerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}