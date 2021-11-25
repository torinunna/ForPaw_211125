package com.yujin.forpaw_211125

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivitySignInBinding

class SignInActivity : BaseActivity() {

    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}