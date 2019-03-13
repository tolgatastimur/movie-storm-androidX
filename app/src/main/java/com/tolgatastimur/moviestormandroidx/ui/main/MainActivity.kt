package com.tolgatastimur.moviestormandroidx.ui.main

import android.os.Bundle
import android.util.Log
import com.iammert.library.readablebottombar.ReadableBottomBar
import com.tolgatastimur.moviestormandroidx.R
import com.tolgatastimur.moviestormandroidx.core.BaseActivity
import com.tolgatastimur.moviestormandroidx.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onTabSelected()

    }


    private fun onTabSelected(){
        binding.bottomBar.setOnItemSelectListener(object: ReadableBottomBar.ItemSelectListener{
            override fun onItemSelected(index: Int) {
                when(index){
                    0->binding.textView.text="Main List"
                    1->binding.textView.text="Popular"
                    2->binding.textView.text="Movies"
                    3->binding.textView.text="Watch List"
                    4->binding.textView.text="Search"
                }
            }
        })
    }
}
