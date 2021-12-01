package com.neppplus.gudocin_android.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.gudocin_android.fragments.PurcahaseListFragment
import com.neppplus.gudocin_android.fragments.TestReviewListFragment

class PurchaseViewAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> PurcahaseListFragment()
            else -> TestReviewListFragment()
        }

    }
}