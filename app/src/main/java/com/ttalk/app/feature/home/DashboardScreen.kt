package com.ttalk.app.feature.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ttalk.app.core.ui.GlobalUiViewModel

@Composable
fun DashboardScreen(
    navController: NavController,
    globalUiViewModel: GlobalUiViewModel,
    viewModel: DashboardViewModel = hiltViewModel()
) {
    // TODO: Implement PTT button, call status card, SOS logic
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text("TTalk", style = MaterialTheme.typography.headlineLarge)
            Text("Dashboard — PTT Screen", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
