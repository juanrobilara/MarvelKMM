package com.unlam.marvel.data.api

import com.unlam.marvel.data.network.PUBLIC_KEY
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import kotlinx.serialization.Serializable

@Serializable
data class CharactersResponse(
    val data: CharacterData,
)

@Serializable
data class CharacterData(
    val results: List<CharacterResult>,
)

@Serializable
data class CharacterResult(
    val id: Long,
    val name: String,
    val description: String,
    val thumbnail: Thumbnail,
)

@Serializable
data class Thumbnail(
    val path: String,
    val extension: String,
) {
    fun toUrl(): String = "$path.$extension"
}

class MarvelCharactersClient(
    private val client: HttpClient,
) {
    suspend fun getAllCharacters(
        timestamp: Long,
        md5: String,
    ): HttpResponse =
        client.get("https://gateway.marvel.com/v1/public/characters") {
            parameter("ts", timestamp)
            parameter("hash", md5)
            parameter("apikey", PUBLIC_KEY)
        }
}
