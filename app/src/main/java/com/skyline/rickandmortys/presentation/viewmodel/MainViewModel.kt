package com.skyline.rickandmortys.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skyline.rickandmortys.data.remote.RickAndMortyRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: RickAndMortyRepository) : ViewModel() {
    private val _character = MutableLiveData<Character>()
    val character: LiveData<Character> = _character

    fun getCharacterById() {
        viewModelScope.launch {
         //   val character = repository.getCharacterById()
          //  _character.value = character
        }
    }
}
