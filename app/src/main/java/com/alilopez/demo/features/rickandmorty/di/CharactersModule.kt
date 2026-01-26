package com.alilopez.demo.features.rickandmorty.di

import com.alilopez.demo.core.di.AppContainer
import com.alilopez.demo.features.rickandmorty.domain.usecases.GetCharactersUseCase
import com.alilopez.demo.features.rickandmorty.presentation.viewmodels.CharactersViewModelFactory

class CharactersModule(
    private val appContainer: AppContainer) {

    private fun provideGetCharactersUseCase(): GetCharactersUseCase {
        return GetCharactersUseCase(appContainer.charactersRepository)
    }

    fun provideCharactersViewModelFactory(): CharactersViewModelFactory {
        return CharactersViewModelFactory(
            getCharactersUseCase = provideGetCharactersUseCase()
        )
    }
}
