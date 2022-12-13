package com.example.hotelapi.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hotelapi.databinding.ActivityResetPasswordBinding
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResetPasswordBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityResetPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.resetButton.setOnClickListener{
            val email=binding.resetEmail.text.toString()
            if(email.isNotEmpty()){
                firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener{
                    if(it.isSuccessful){
                        startActivity(Intent(this, LoginActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Error: ${it.exception?.message}",Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this,"Please fill all fields",Toast.LENGTH_SHORT).show()
            }
        }
    }
}