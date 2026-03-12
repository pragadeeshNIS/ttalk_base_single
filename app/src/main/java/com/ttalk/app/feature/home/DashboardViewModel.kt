package com.ttalk.app.feature.home

import com.ttalk.app.core.base.BaseViewModel
import com.ttalk.app.core.preferences.AppPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val prefs: AppPreferences
) : BaseViewModel<String>() {
    // Example: expose a greeting using the base state machine
    fun load() {
        setLoading()
        setSuccess("Welcome!")
    }
}
