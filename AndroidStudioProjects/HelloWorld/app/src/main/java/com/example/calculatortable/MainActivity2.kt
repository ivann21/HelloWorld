package com.example.calculatortable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatortable.databinding.ActivityMain2Binding
import com.example.calculatortable.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnClickListener{
            binding.emailText.isEnabled = binding.switch1.isChecked
        }
        binding.toggleButton.setOnClickListener{
            if(binding.toggleButton.isChecked)
            binding.textView3.text = "Activado"
            else
                binding.textView3.text = "Desactivado"
        }
    }
}