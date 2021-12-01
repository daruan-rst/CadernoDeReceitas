package com.study.cadernodereceitas.Entities.Converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.study.cadernodereceitas.Entities.CategoryItem

class CategoryListConverter {
    @TypeConverter
    fun fromCategoryList(categoryList: List<CategoryItem>?):String?{
        if (categoryList == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object : TypeToken<CategoryItem>(){

            }.type
            return gson.toJson(categoryList,type)
        }
    }
    @TypeConverter
    fun toCategoryList ( categoryString: String):List<CategoryItem>?{
        if (categoryString == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object :TypeToken<CategoryItem>(){

            }.type
            return  gson.fromJson(categoryString,type)
        }
    }

}