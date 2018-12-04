package com.example.xand.cocktailapp.scenarios_main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.xand.cocktailapp.utils.GlideApp
import com.example.xand.cocktailapp.R
import com.example.xand.cocktailapp.entities.Drink
import kotlinx.android.synthetic.main.drinks_item.view.*

class DrinkAdapter(val context: Context, val drinks: List<Drink>)
    : RecyclerView.Adapter<DrinkAdapter.ViewHolder>() {

    var itemClickListener: ((index: Int) -> Unit)? = null

    fun setOnItemClickListener(clique: ((index: Int) -> Unit)){
        this.itemClickListener = clique
    }

    var buttonClickListener: ((index: Int) -> Unit)? = null

    fun setOnButtonClickListener(cliqueButton: ((index: Int) -> Unit)){
        this.buttonClickListener = cliqueButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.drinks_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return drinks.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(context, drinks[position], itemClickListener, buttonClickListener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(context: Context, drink: Drink, itemClickListener: ((index: Int) -> Unit)?, buttonClickListener: ((index: Int) -> Unit)? = null) {
            itemView.tvDrink.text = drink.strDrink


            GlideApp.with(context)
                .load(drink.strDrinkThumb)
                .placeholder(R.drawable.no_image)
                .centerCrop()
                .into(itemView.imgDrinks)


            if(itemClickListener != null) {
                itemView.setOnClickListener {
                    itemClickListener.invoke(adapterPosition)
                }
            }

            if(buttonClickListener != null) {
                itemView.setOnClickListener {
                    buttonClickListener.invoke(adapterPosition)
                }
            }

        }

    }

}