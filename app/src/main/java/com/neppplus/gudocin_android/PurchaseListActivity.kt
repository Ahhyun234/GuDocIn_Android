package com.neppplus.gudocin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import com.neppplus.gudocin_android.adapters.PurchaseViewPagerAdapter
import com.neppplus.gudocin_android.databinding.ActivityPurchaseListBinding

class PurchaseListActivity : BaseActivity() {

    lateinit var binding: ActivityPurchaseListBinding
    lateinit var mAdapter : PurchaseViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_purchase_list)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mAdapter = PurchaseViewPagerAdapter(supportFragmentManager)
        binding.purchaseViewPager.adapter = mAdapter

        binding.tabLayout.setupWithViewPager(binding.purchaseViewPager)

    }


}