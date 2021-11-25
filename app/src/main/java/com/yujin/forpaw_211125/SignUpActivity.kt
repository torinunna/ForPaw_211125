package com.yujin.forpaw_211125

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity() {

    lateinit var binding : ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}