package com.neppplus.gudocin_android.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.gudocin_android.fragments.PurchFrag

class PurchsviepagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm)

{
    override fun getCount() = 2
    override fun getItem(position: Int): Fragment {

        return when(position) {
             0-> PurchFrag()
            else -> TestReviewLisFragment(


            )
        }

    }
}