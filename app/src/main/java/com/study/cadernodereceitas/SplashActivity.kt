package com.study.cadernodereceitas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.study.cadernodereceitas.Entities.Category
import com.study.cadernodereceitas.Interface.GetDataService
import com.study.cadernodereceitas.RetrofitClient.RetrofitClientInstance
import kotlinx.android.synthetic.main.activity_splash.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


// uma splash activity é uma janela que contenha uma imagem, uma logo e a versão atual do software

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        buttonGetStarted.setOnClickListener{
            var intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getCategories(){
        val service = RetrofitClientInstance.retrofitInstance.create(GetDataService::class.java)
        val call = service.getCategoryList()
        call.enqueue(object : Callback<List<Category>>{
            override fun onResponse(
                call: Call<List<Category>>,
                response: Response<List<Category>>
            ) {
                insertDataIntoRoomDb(response.body()!!)
            }

            override fun onFailure(call: Call<List<Category>>, t: Throwable) {

                loader.visibility = View.INVISIBLE

              Toast.makeText(this@SplashActivity, "ERROR",Toast.LENGTH_SHORT ).show()
            }

        })
    }

    fun insertDataIntoRoomDb(Category :  List<Category>){

    }

}