package com.example.autologoutproofofconcept

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.autologoutproofofconcept.databinding.ActivityLogoutBinding

class LogoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGoToMainPage.setOnClickListener {
            val intent = Intent(this@LogoutActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}