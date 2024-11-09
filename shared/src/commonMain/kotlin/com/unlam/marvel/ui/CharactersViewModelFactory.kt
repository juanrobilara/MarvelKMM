import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
/*
class CharactersViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val httpClient = HttpClient(OkHttp) {
            install(ContentNegotiation) {
                json(Json { ignoreUnknownKeys = true })
            }
        }

        val apiClient = MarvelCharactersClient(httpClient)
        val charactersRepository = KtorCharactersRepository(apiClient)
        val charactersService = CharactersService(charactersRepository)

        return CharactersViewModel(charactersService) as T
    }
}
*/
