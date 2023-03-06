package com.zebdul.backpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import com.zebdul.backpaper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.themeSwitch.setOnClickListener {
            if (binding.themeSwitch.isChecked){
                Toast.makeText(this,"Dark theme is applied", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, DarkTheme::class.java)
                startActivity(intent)
                            }
            else{Toast.makeText(this,"Light theme is applied", Toast.LENGTH_SHORT).show()

            }
        }
    }
}