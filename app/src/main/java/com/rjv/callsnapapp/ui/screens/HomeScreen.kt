package com.rjv.callsnapapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.rjv.callsnapapp.viewmodel.AppUiState

@Composable
fun HomeScreen(
    uiState: AppUiState,
    onOpenSettings: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text(
                text = "CallSnap",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Hello, ${uiState.settings.username.ifBlank { "Guest" }}",
                style = MaterialTheme.typography.titleMedium,
            )

            Card(colors = CardDefaults.cardColors()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Это первый нативный экран.")
                    Text(text = "Дальше сюда переносим карточки, звуки и действия из HTML-версии.")
                }
            }
        }

        Button(
            onClick = onOpenSettings,
            modifier = Modifier.align(Alignment.End),
        ) {
            Text("Settings")
        }
    }
}
