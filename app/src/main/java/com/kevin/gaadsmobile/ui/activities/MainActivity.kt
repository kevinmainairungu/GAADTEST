package com.kevin.gaadsmobile.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kevin.gaadsmobile.R
import com.kevin.gaadsmobile.adapters.SectionsPagerAdapter
import com.kevin.gaadsmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        mBinding.viewPager.adapter = sectionsPagerAdapter

        mBinding.tabs.setupWithViewPager(mBinding.viewPager)

        mBinding.btnSubmit.setOnClickListener {
            startActivity(Intent(this, SubmitActivity::class.java))
        }

    }


}