package com.alilopez.demo.features.rickandmorty.data.repositories

import com.alilopez.demo.core.network.RickAndMortyApi
import com.alilopez.demo.features.rickandmorty.data.datasources.remote.mapper.toDomain
import com.alilopez.demo.features.rickandmorty.domain.repositories.CharactersRepository
import com.alilopez.demo.features.rickandmorty.domain.entities.Character

class CharactersRepositoryImpl(
    private val api: RickAndMortyApi
) : CharactersRepository {

    override suspend fun getCharacters(): List<Character> {
        val response = api.getCharacters()
        return response.results.map { it.toDomain() }
    }
}