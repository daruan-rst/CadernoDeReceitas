package com.study.cadernodereceitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.study.cadernodereceitas.adapter.MainCategoryAdapter
import com.study.cadernodereceitas.adapter.SubCategoryAdapter
import com.study.cadernodereceitas.entities.Recipe
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    var arrayMainCategory = ArrayList<Recipe>()
    var arraySubCategory = ArrayList<Recipe>()
    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        // Dummy entries for test purpose
        arrayMainCategory.add(Recipe(1,"Pato ao molho de laranja"))
        arrayMainCategory.add(Recipe(2,"Bolo de fubá"))
        arrayMainCategory.add(Recipe(3,"Pão de queijo"))
        arrayMainCategory.add(Recipe(4,"Brigadeiro"))

        mainCategoryAdapter.setData(arrayMainCategory)

        arraySubCategory.add(Recipe(1,"Pão Australiano"))
        arraySubCategory.add(Recipe(2,"Coxinha de Frango"))
        arraySubCategory.add(Recipe(3,"Tempurá Udon"))
        arraySubCategory.add(Recipe(4,"Panetone"))

        subCategoryAdapter.setData(arraySubCategory)

        //

        rv_main_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_sub_category.adapter = subCategoryAdapter




    }
}