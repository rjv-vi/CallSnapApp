package com.rjv.callsnapapp.viewmodel

import com.rjv.callsnapapp.data.model.AppSettings

data class AppUiState(
    val settings: AppSettings = AppSettings(),
)
