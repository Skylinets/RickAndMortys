package com.skyline.rickandmortys.data.repository

import com.skyline.rickandmortys.data.remote.RickAndMortyRepository
import com.skyline.rickandmortys.data.remote.RickAndMortyService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RickAndMortyRepositoryImpl : RickAndMortyRepository {
    private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    private val service: RickAndMortyService = retrofit.create(RickAndMortyService::class.java)

    override suspend fun getCharacterById(){
        return service.getCharacterById().enqueue(object : Callback<Any> {
            override fun onResponse(p0: Call<Any>, p1: Response<Any>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(p0: Call<Any>, p1: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}
