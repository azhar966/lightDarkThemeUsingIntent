package com.zebdul.backpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zebdul.backpaper.databinding.ActivityDarkThemeBinding

class DarkTheme : AppCompatActivity() {
    lateinit var binding:ActivityDarkThemeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDarkThemeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.themeSwitch2.setOnClickListener {
            if (binding.themeSwitch2.isChecked){
                Toast.makeText(this,"Dark theme is applied", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@DarkTheme, MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Light theme is applied", Toast.LENGTH_SHORT).show()

            }
        }

    }
}