package com.study.cadernodereceitas.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.cadernodereceitas.R
import com.study.cadernodereceitas.Entities.Recipe
import kotlinx.android.synthetic.main.item_rv_main_category.view.*

class MainCategoryAdapter : RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(view: View) :RecyclerView.ViewHolder(view){

    }

    var arrayMainCategory = ArrayList<Recipe>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arrayMainCategory[position].recipeName
    }

    override fun getItemCount(): Int {
        return arrayMainCategory.size
    }

    fun setData(arrData : List<Recipe>){
        arrayMainCategory = arrData as ArrayList<Recipe>
    }
}