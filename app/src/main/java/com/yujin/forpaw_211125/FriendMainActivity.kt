package com.yujin.forpaw_211125

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw_211125.databinding.ActivityFriendMainBinding

class FriendMainActivity : BaseActivity() {

    lateinit var binding : ActivityFriendMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_friend_main)
    }

    override fun setupEvents() {

    }

    override fun setValues() {
    }
}