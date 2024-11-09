package com.unlam.marvel.android.ui.screens

import com.unlam.marvel.domain.models.Character

sealed class ScreenState {

    object Loading : ScreenState()

    class ShowCharacters(val list: List<Character>) : ScreenState()
}