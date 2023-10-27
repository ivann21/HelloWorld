package com.example.calculatortable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatortable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.acButton.setOnClickListener {
            binding.operationsTextView.text = ""
        }

        binding.oneButton.setOnClickListener { _ ->
            addTextToOperations("1")
        }
        binding.twoButton.setOnClickListener { _ ->
            addTextToOperations("2")
        }

    }
    fun addTextToOperations(v: String){
        binding.operationsTextView.text =
            binding.operationsTextView.text.toString() + v
    }
}