package com.unlam.marvel.domain.repository

import com.unlam.marvel.data.model.CharactersResponse
import com.unlam.marvel.domain.models.Character
/*
class KtorCharactersRepository(
    private val client: MarvelCharactersClient,
) : CharactersRepository {
    override suspend fun getCharacters(
        timestamp: Long,
        md5: String,
    ): List<Character> = client.getAllCharacters(timestamp, md5).toModel()*/

private fun CharactersResponse.toModel(): List<Character> =
    this.characters.list.map {
        Character(
            id = it.id,
            name = it.name,
            description = it.description,
            thumbnailUrl = it.thumbnail.toUrl(),
        )
    }
// }
