package com.study.cadernodereceitas.Interface

import com.study.cadernodereceitas.Entities.Category
import retrofit2.Call
import retrofit2.http.GET

interface GetDataService {

    @GET("/categories.php")
    fun getCategoryList() : Call<List<Category>>

}