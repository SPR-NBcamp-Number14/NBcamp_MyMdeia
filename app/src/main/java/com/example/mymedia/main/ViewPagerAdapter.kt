package com.example.mymedia.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mymedia.home.HomeFragment
import com.example.mymedia.my_video.MyVideoFragment
import com.example.mymedia.search.SearchFragment

class ViewPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    private val fragments = mutableListOf<Fragment>()

    init {
        fragments.apply {
            add(HomeFragment())
            add(SearchFragment())
            add(MyVideoFragment())
        }
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}