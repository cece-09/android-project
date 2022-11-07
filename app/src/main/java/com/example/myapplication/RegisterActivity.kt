package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.RegisterOneFragment
import com.example.myapplication.databinding.ActivityRegisterBinding
import com.example.myapplication.databinding.FragmentRegisterOneBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnNext.setOnClickListener {
            setFragment()
        }
    }

    private fun setFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.register_fragment_content, RegisterOneFragment())
        transaction.commit()
    }
}