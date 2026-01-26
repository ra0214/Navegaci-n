package com.alilopez.demo.features.rickandmorty.presentation.screens
import com.alilopez.demo.features.rickandmorty.domain.entities.Character

data class CharactersUiState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
    val error: String? = null,
    val isRefreshing: Boolean = false
)