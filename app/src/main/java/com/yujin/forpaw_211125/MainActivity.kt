package com.yujin.forpaw_211125

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        binding.signInBtn.setOnClickListener {
            val signInIntent = Intent(mContext, SignInActivity::class.java)
            startActivity(signInIntent)
        }

        binding.signUpBtn.setOnClickListener {
            val signUpIntent = Intent(mContext, SignUpActivity::class.java)
            startActivity(signUpIntent)
        }
    }

    override fun setValues() {
    }
}