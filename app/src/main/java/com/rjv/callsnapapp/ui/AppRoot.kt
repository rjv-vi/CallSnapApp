package com.rjv.callsnapapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.rjv.callsnapapp.ui.theme.CallSnapTheme
import com.rjv.callsnapapp.viewmodel.MainViewModel

@Composable
fun AppRoot(viewModel: MainViewModel) {
    val uiState by viewModel.uiState.collectAsState()

    CallSnapTheme(darkTheme = uiState.settings.darkMode) {
        AppNavHost(
            uiState = uiState,
            onToggleDarkMode = viewModel::toggleDarkMode,
            onSetUsername = viewModel::setUsername,
            onSetAccent = viewModel::setAccent,
        )
    }
}
