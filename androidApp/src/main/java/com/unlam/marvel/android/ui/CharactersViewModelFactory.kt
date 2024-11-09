import android.net.http.HttpResponseCache.install
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.unlam.marvel.android.ui.screens.CharactersViewModel
import com.unlam.marvel.data.api.MarvelCharactersClient
import com.unlam.marvel.domain.repository.KtorCharactersRepository
import okhttp3.OkHttp


class CharactersViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val client = HttpClient(OkHttp) {
            install(JsonFeature) {
                serializer = KotlinxSerializer()
            }
            install(Logging) {
                level = LogLevel.BODY
            }
            defaultRequest {
                url {
                    protocol = URLProtocol.HTTPS
                    host = "gateway.marvel.com"
                }
                parameter("apikey", PUBLIC_KEY)
            }
        }

        val apiClient = MarvelCharactersClient(client)
        val charactersRepository = KtorCharactersRepository(apiClient)
        val charactersService = CharactersService(charactersRepository)
        return CharactersViewModel(charactersService) as T
    }
}