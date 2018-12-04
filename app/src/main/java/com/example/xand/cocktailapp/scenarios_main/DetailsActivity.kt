package com.example.xand.cocktailapp.scenarios_main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.xand.cocktailapp.utils.GlideApp
import com.example.xand.cocktailapp.R
import com.example.xand.cocktailapp.entities.Drink
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    companion object {
        public const val DRINK: String = "Drink" //para putExtra entre activities

    }

    var drink: Drink? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //verifica se foi passado um drink para alteração
        drink = intent.getSerializableExtra(DRINK) as Drink?
        if(drink != null){
            carregaDados()
        }
    }

    //exibe as informações do drink na Activity
    private fun carregaDados() {
        drinkName.setText("Name: " + drink?.strDrink)
        drinkId.setText("ID: " + drink?.idDrink)

        if(drink?.strInstructions != null) {
            drinkInstructions.setText("Instructions: " + drink?.strInstructions)
        }

        GlideApp.with(this)
            .load(drink?.strDrinkThumb)
            .placeholder(R.drawable.no_image)
            .centerCrop()
            .into(imgDrinks)

    }

}