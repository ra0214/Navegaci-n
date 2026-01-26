package com.alilopez.demo.features.rickandmorty.domain.repositories
import com.alilopez.demo.features.rickandmorty.domain.entities.Character


interface CharactersRepository {
    suspend fun getCharacters(): List<Character>
}