package com.example.xand.cocktailapp.network

import com.example.xand.cocktailapp.entities.DrinkList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DrinkService {

    /*
    companion object {
        private const val API_KEY = "1"
    }

    @GET("/$API_KEY/search.php?")
    fun getAllDrinks(@Query("") query: String): Call<DrinkList>

    @GET("$API_KEY/random.php?")
    fun getRandomDrink(): Call<DrinkList>

    */

    @GET("random.php")
    fun getRandomDrink(): Call<DrinkList>

    @GET("filter.php")
    fun getAlcoholic(@Query("a") a: String = "Alcoholic"): Call<DrinkList>


    /*

    a. Lista de todos os drinks alcoólicos
    b. Detalhes dos drinks
    c. Drinks de forma aleatória

     */

}