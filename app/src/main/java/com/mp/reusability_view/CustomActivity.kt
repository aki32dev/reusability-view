package com.mp.reusability_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mp.reusability_view.databinding.ActivityCustomBinding

class CustomActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCustomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAction()
    }

    private fun initAction() {
        with(binding) {

        }
    }
}