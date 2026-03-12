package com.ttalk.app.core.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

data class GlobalUiAction(val label: String, val onClick: () -> Unit)

@HiltViewModel
class GlobalUiViewModel @Inject constructor() : ViewModel() {
    private val _title = MutableStateFlow("")
    val title: StateFlow<String> = _title

    // TODO: Add actions, PTT lock state, search visibility
    fun updateUi(title: String) { _title.value = title }
}
