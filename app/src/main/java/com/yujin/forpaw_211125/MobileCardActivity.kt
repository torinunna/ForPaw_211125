package com.yujin.forpaw_211125

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivityMobileCardBinding

class MobileCardActivity : BaseActivity() {

    lateinit var binding : ActivityMobileCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mobile_card)
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}