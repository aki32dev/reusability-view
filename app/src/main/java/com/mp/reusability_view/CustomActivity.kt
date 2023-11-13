package com.mp.reusability_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.core.widget.doOnTextChanged
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
            etEmail.doOnTextChanged { text, _, _, _ ->
                etEmail.setBackground(isValidEmail(text.toString()))
                etEmail.valid
            }
        }
    }

    private fun isValidEmail(parameter: String): Boolean {
        return !TextUtils.isEmpty(parameter) && Patterns.EMAIL_ADDRESS.matcher(parameter).matches()
    }
}