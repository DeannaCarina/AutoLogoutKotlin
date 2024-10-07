package com.example.autologoutproofofconcept

import android.content.Intent
import android.os.Bundle
import com.example.autologoutproofofconcept.databinding.ActivityThirdBinding

class ThirdActivity : MainActivity() {

    private lateinit var binding: ActivityThirdBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGoToMainPage.setOnClickListener {
            val intent = Intent(this@ThirdActivity, MainActivity::class.java)
            startActivity(intent)
        }
        binding.buttonGoToSecondActivity.setOnClickListener {
            val intent = Intent(this@ThirdActivity, SecondActivity::class.java)
            startActivity(intent)
        }

    }

}