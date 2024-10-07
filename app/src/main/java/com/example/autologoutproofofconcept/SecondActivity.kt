package com.example.autologoutproofofconcept

import android.content.Intent

import android.os.Bundle
import com.example.autologoutproofofconcept.databinding.ActivitySecondBinding


class SecondActivity : MainActivity() {

    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGoToMainPage.setOnClickListener {
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
        binding.buttonGoToThirdActivity.setOnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        }

    }

}