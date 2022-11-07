package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityPassBinding

class PassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPassBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPass.setOnClickListener {
            startRegisterActivity()
        }
        binding.btnKakao.setOnClickListener {
            startRegisterActivity()
        }
    }
    private fun startRegisterActivity() {
        val intent: Intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

}