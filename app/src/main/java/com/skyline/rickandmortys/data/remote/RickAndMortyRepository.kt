package com.skyline.rickandmortys.data.remote

interface RickAndMortyRepository {
    suspend fun getCharacterById()
}
