package com.yujin.forpaw_211125

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivityAddFriendBinding

class AddFriendActivity : BaseActivity() {

    lateinit var binding : ActivityAddFriendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_friend)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}