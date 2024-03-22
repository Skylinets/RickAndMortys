package com.skyline.rickandmortys.data.remote

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET

interface RickAndMortyService {
    @GET("character/2")
    fun getCharacterById() : Call<Any>
}