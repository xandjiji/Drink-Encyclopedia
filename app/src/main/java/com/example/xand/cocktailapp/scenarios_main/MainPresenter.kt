package com.example.xand.cocktailapp.scenarios_main

import android.content.Context
import com.example.xand.cocktailapp.entities.DrinkList
import com.example.xand.cocktailapp.network.RetrofitInicializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val view : MainContract.View) :
    MainContract.Presenter {

    override fun onLoadList(context: Context){

        view.showLoading()

        val drinkService = RetrofitInicializer().createDrinksService()

        val call = drinkService.getAlcoholic()

        call.enqueue(object : Callback<DrinkList> {
            override fun onFailure(call: Call<DrinkList>, t: Throwable) {
                view.hideLoading()
                view.showMessage("Falha na conexão. Verifique o acesso a internet")
            }

            override fun onResponse(call: Call<DrinkList>, response: Response<DrinkList>) {
                view.hideLoading()
                if(response.body() != null){
                    view.showList(response.body()!!.drinks)
                }else {
                    view.showMessage("Hoje estamos sem drinks")
                }
            }
        })

    }

    override fun onLoadListRandom(context: Context){

        view.showLoading()

        val drinkService = RetrofitInicializer().createDrinksService()

        val call = drinkService.getRandomDrink()

        call.enqueue(object : Callback<DrinkList> {
            override fun onFailure(call: Call<DrinkList>, t: Throwable) {
                view.hideLoading()
                view.showMessage("Falha na conexão. Verifique o acesso a internet")
            }

            override fun onResponse(call: Call<DrinkList>, response: Response<DrinkList>) {
                view.hideLoading()
                if(response.body() != null){
                    view.showList(response.body()!!.drinks)
                }else {
                    view.showMessage("Hoje estamos sem drinks")
                }
            }
        })

    }

}