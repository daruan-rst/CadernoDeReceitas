package com.study.cadernodereceitas.entities.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.study.cadernodereceitas.entities.Category

class CategoryListConverter {
    @TypeConverter
     fun fromCategoryList(categoryList : List<Category>) : String? {
         if (categoryList == null){
             return null
         }else{
             val gson = Gson()
             val type = object : TypeToken<Category>(){

             }.type
             return gson.toJson(categoryList,type)
         }
     }

    @TypeConverter
    fun toCategoryList(categoryString : String) : List<Category>?{
    if (categoryString.equals("")||categoryString == null){
        return null
    }else{
        val gson = Gson()
        val type = object : TypeToken<Category>(){

        }.type
        return gson.fromJson(categoryString,type)
    }

    }
}