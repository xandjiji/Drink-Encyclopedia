package com.example.xand.cocktailapp.scenarios_main

import android.content.Context
import com.example.xand.cocktailapp.entities.Drink

interface MainContract {

    interface View{
        fun showMessage(msg: String)
        fun showList(drinks: List<Drink>)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun onLoadList(context: Context)
        fun onLoadListRandom(context: Context)
    }

}