package com.unlam.marvel.data.network

import io.ktor.client.*
import io.ktor.client.request.*

/*
class PublicKeyInterceptor : HttpClientFeature<Unit, PublicKeyInterceptor> {
    override val key: AttributeKey<PublicKeyInterceptor> = AttributeKey("PublicKeyInterceptor")

    override fun prepare(block: Unit.() -> Unit) = PublicKeyInterceptor()

    override fun install(feature: PublicKeyInterceptor, scope: HttpClient) {
        scope.requestPipeline.intercept(HttpRequestPipeline.State) {
            context.url.parameters.append("apikey", PUBLIC_KEY)
        }
    }
}*/
