package com.rjv.callsnapapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rjv.callsnapapp.data.model.AppSettings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    settings: AppSettings,
    onBack: () -> Unit,
    onToggleDarkMode: (Boolean) -> Unit,
    onSetUsername: (String) -> Unit,
    onSetAccent: (String) -> Unit,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Settings") },
            navigationIcon = {
                Button(onClick = onBack) { Text("Back") }
            }
        )

        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            OutlinedTextField(
                value = settings.username,
                onValueChange = onSetUsername,
                label = { Text("Username") },
                singleLine = true,
            )

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Dark mode")
                Switch(
                    checked = settings.darkMode,
                    onCheckedChange = onToggleDarkMode,
                )
            }

            OutlinedTextField(
                value = settings.accent,
                onValueChange = onSetAccent,
                label = { Text("Accent") },
                singleLine = true,
            )
        }
    }
}
