package com.study.cadernodereceitas.Entities

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.study.cadernodereceitas.Entities.Converter.CategoryListConverter

@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id : Int,

    @ColumnInfo(name ="categoryItems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categoryItems : List<CategoryItem>? = null
)

