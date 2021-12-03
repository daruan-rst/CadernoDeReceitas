package com.study.cadernodereceitas.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.study.cadernodereceitas.R
import com.study.cadernodereceitas.ReceitaActivity
import com.study.cadernodereceitas.entities.Recipe
import kotlinx.android.synthetic.main.item_rv_main_category.view.tv_dish_name

class SubCategoryAdapter(private val context: Context) : RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(private val view: View) :RecyclerView.ViewHolder(view){

        fun vincular(context: Context){
            view.setOnClickListener{
                val intent = Intent(context, ReceitaActivity::class.java)
                context.startActivity(intent)
                val textCardReceita: TextView = view.findViewById(R.id.dish)
                textCardReceita.text
            }
        }
    }

    var arraySubCategory = ArrayList<Recipe>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_sub_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arraySubCategory[position].recipeName
        holder.vincular(context)
    }

    override fun getItemCount(): Int {
        return arraySubCategory.size
    }

    fun setData(arrData : List<Recipe>){
        arraySubCategory = arrData as ArrayList<Recipe>
    }
}