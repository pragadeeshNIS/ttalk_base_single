package com.ttalk.app.core.preferences

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

// TODO: Add all app preference keys (auth, PTT settings, SOS, FCM, etc.)
@Singleton
class AppPreferences @Inject constructor(@ApplicationContext context: Context) {
    private val prefs = context.getSharedPreferences("ttalk_prefs", Context.MODE_PRIVATE)

    var accessToken: String
        get() = prefs.getString("access_token", "") ?: ""
        set(value) = prefs.edit().putString("access_token", value).apply()

    var isKnitted: Boolean
        get() = prefs.getBoolean("is_knitted", false)
        set(value) = prefs.edit().putBoolean("is_knitted", value).apply()
}
