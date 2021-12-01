package com.study.cadernodereceitas.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.study.cadernodereceitas.Dao.RecipeDao
import com.study.cadernodereceitas.Entities.Category
import com.study.cadernodereceitas.Entities.CategoryItem
import com.study.cadernodereceitas.Entities.Recipe
import com.study.cadernodereceitas.Entities.Converter.CategoryListConverter

@Database(entities = [Recipe::class, Category::class, CategoryItem::class,CategoryListConverter::class], version = 1, exportSchema = false)
abstract class RecipeDatabase : RoomDatabase() {

    companion object{
        var recipeDatabase : RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context : Context) : RecipeDatabase{
            if(recipeDatabase!=null){
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                    ).build()
            }
        return recipeDatabase!!}
    }

    abstract fun recipeDao():RecipeDao
}