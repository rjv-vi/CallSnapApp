package com.rjv.callsnapapp.data.repository

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.rjv.callsnapapp.data.model.AppSettings
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "callsnap_settings")

class SettingsRepository(private val context: Context) {

    private object Keys {
        val Username = stringPreferencesKey("username")
        val DarkMode = booleanPreferencesKey("dark_mode")
        val Accent = stringPreferencesKey("accent")
    }

    val settings: Flow<AppSettings> = context.dataStore.data.map { prefs ->
        AppSettings(
            username = prefs[Keys.Username] ?: "",
            darkMode = prefs[Keys.DarkMode] ?: false,
            accent = prefs[Keys.Accent] ?: "blue",
        )
    }

    suspend fun updateUsername(value: String) {
        context.dataStore.edit { it[Keys.Username] = value }
    }

    suspend fun updateDarkMode(value: Boolean) {
        context.dataStore.edit { it[Keys.DarkMode] = value }
    }

    suspend fun updateAccent(value: String) {
        context.dataStore.edit { it[Keys.Accent] = value }
    }
}
