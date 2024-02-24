package com.example.mobdevemp

import android.content.Context
import com.example.mobdevemp.Models.RandomRecipeApiResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class RequestManager(private val context: Context) {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.spoonacular.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private interface CallRandomRecipes {
        @GET("recipes/random")
        fun callRandomRecipe(
            @Query("apiKey") apiKey: String,
            @Query("number") number: String
        ): Call<RandomRecipeApiResponse>
    }
}
