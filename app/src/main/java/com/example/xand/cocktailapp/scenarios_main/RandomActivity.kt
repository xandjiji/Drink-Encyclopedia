package com.example.xand.cocktailapp.scenarios_main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ProgressBar
import android.widget.Toast
import com.example.xand.cocktailapp.R
import com.example.xand.cocktailapp.entities.Drink
import kotlinx.android.synthetic.main.activity_main.*

class RandomActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        val presenter : MainContract.Presenter =
            MainPresenter(this)
        presenter.onLoadListRandom(this)

    }

    override fun showList(drinks: List<Drink>) {

        val adapter = DrinkAdapter(this, drinks)
        adapter.setOnItemClickListener {index ->
            val detalhes = Intent(this, DetailsActivity::class.java)
            detalhes.putExtra(DetailsActivity.DRINK, drinks[index])
            startActivity(detalhes)
        }


        rvDrinks.adapter = adapter
        rvDrinks.layoutManager = LinearLayoutManager(this)
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        pbLoading.visibility = ProgressBar.VISIBLE
    }

    override fun hideLoading() {
        pbLoading.visibility = ProgressBar.INVISIBLE
    }


}