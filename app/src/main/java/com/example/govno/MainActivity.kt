package com.example.govno

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.govno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


            binding.bReplaceFragment.setOnClickListener{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.flblankplace, BlankFragment.newInstance())
                    .commit()
            }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flblankplace,BlankFragment2.newInstance())
            .commit()

        setContentView(binding.root)
    }
}