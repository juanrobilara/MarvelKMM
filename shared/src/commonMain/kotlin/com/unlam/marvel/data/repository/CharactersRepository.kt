package com.unlam.marvel.data.repository

import com.unlam.marvel.domain.models.Character

interface CharactersRepository {
    suspend fun getCharacters(
        timestamp: Long,
        md5: String,
    ): List<Character>
}
