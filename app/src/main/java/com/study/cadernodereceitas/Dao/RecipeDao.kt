package com.study.cadernodereceitas.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.study.cadernodereceitas.Entities.Category

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM category ORDER BY id DESC")
    val getAllCategories:List<Category>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategory(category: Category)
}