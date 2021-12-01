package com.neppplus.gudocin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.neppplus.gudocin_android.databinding.ActivityMyProductPurchaseListBinding

class MyProductPurchaseListActivity : BaseActivity() {

    lateinit var binding :

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.)
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}