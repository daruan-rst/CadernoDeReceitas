package com.study.cadernodereceitas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.cadernodereceitas.R
import com.study.cadernodereceitas.entities.Recipe
import kotlinx.android.synthetic.main.item_rv_main_category.view.tv_dish_name

class SubCategoryAdapter : RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(view: View) :RecyclerView.ViewHolder(view){

    }

    var arraySubCategory = ArrayList<Recipe>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_sub_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arraySubCategory[position].recipeName
    }

    override fun getItemCount(): Int {
        return arraySubCategory.size
    }

    fun setData(arrData : List<Recipe>){
        arraySubCategory = arrData as ArrayList<Recipe>
    }
}