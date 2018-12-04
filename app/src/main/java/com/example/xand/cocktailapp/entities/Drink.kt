package com.example.xand.cocktailapp.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity
data class Drink(var strDrink: String,
                 var strInstructions: String,
                 var strDrinkThumb: String,
                 @PrimaryKey(autoGenerate = true)
                 var idDrink: Int = 0) : Serializable

/*
@Entity
data class Drink(var strDrink: String,
                 var strDrinkES: String,
                 var strDrinkDE: String,
                 var strDrinkFR: String,
                 //var strDrinkZH-HANS: String,
                 //var strDrinkZH-HANT: String,
                 var strVideo: String,
                 var strCategory: String,
                 var strIBA: String,
                 var strAlcoholic: String,
                 var strGlass: String,
                 var strInstructions: String,
                 var strInstructionsES: String,
                 var strInstructionsDE: String,
                 var strInstructionsFR: String,
                 //var strInstructionsZH-HANS: String,
                 //var strInstructionsZH-HANT: String,
                 var strDrinkThumb: String,
                 var strIngredient1: String?,
                 var strIngredient2: String?,
                 var strIngredient3: String?,
                 var strIngredient4: String?,
                 var strIngredient5: String?,
                 var strIngredient6: String?,
                 var strIngredient7: String?,
                 var strIngredient8: String?,
                 var strIngredient9: String?,
                 var strIngredient10: String?,
                 var strIngredient11: String?,
                 var strIngredient12: String?,
                 var strIngredient13: String?,
                 var strIngredient14: String?,
                 var strIngredient15: String?,
                 var strMeasure1: String?,
                 var strMeasure2: String?,
                 var strMeasure3: String?,
                 var strMeasure4: String?,
                 var strMeasure5: String?,
                 var strMeasure6: String?,
                 var strMeasure7: String?,
                 var strMeasure8: String?,
                 var strMeasure9: String?,
                 var strMeasure10: String?,
                 var strMeasure11: String?,
                 var strMeasure12: String?,
                 var strMeasure13: String?,
                 var strMeasure14: String?,
                 var strMeasure15: String?,
                 var dateModified: String?,
                 @PrimaryKey(autoGenerate = true)
                 var idDrink: Int = 0) : Serializable
 */