package com.alilopez.demo.features.rickandmorty.data.datasources.remote.mapper

import com.alilopez.demo.features.rickandmorty.data.datasources.remote.model.CharactersDto
import com.alilopez.demo.features.rickandmorty.domain.entities.Character

fun CharactersDto.toDomain(): Character {
    return Character(
        id = this.id,
        name = this.name,
        status = this.status,
        image = this.image
    )
}