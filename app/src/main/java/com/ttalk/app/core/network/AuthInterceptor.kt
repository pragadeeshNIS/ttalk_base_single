package com.ttalk.app.core.network

import com.ttalk.app.core.preferences.AppPreferences
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

// TODO: Add Bearer token to all requests except /auth/knit
class AuthInterceptor @Inject constructor(private val prefs: AppPreferences) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(
            chain.request().newBuilder()
                .addHeader("Authorization", "Bearer ${prefs.accessToken}")
                .build()
        )
}
