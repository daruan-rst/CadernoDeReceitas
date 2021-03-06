package com.study.cadernodereceitas.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipes")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    var id : Int,

    @ColumnInfo(name ="recipeName")
    var recipeName : String



    ) : Serializable