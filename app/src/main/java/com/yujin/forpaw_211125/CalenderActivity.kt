package com.yujin.forpaw_211125

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivityCalenderBinding

class CalenderActivity : BaseActivity() {

    lateinit var binding : ActivityCalenderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calender)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

    }
}