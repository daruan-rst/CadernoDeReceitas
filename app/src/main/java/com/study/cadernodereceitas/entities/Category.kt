package com.study.cadernodereceitas.entities

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.study.cadernodereceitas.entities.converter.CategoryListConverter

@Entity(tableName = "Category")
data class Category(

    @PrimaryKey(autoGenerate = true)
    var id : Int,

    @Expose
    @SerializedName("categoryItems")
    @ColumnInfo(name ="idCategory")
    @TypeConverters(CategoryListConverter::class)
    val categoryItems: List<CategoryItem>
)

