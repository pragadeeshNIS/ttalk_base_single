package com.ttalk.app.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ttalk.app.core.ui.GlobalUiViewModel
import com.ttalk.app.feature.home.DashboardScreen

@Composable
fun TTalkNavGraph(navController: NavHostController, globalUiViewModel: GlobalUiViewModel, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = NavRoute.Home.route, modifier = modifier) {
        composable(NavRoute.Home.route)    { DashboardScreen(navController, globalUiViewModel) }
        composable(NavRoute.Contact.route) { PlaceholderScreen("Contacts") }
        composable(NavRoute.Group.route)   { PlaceholderScreen("Groups") }
        composable(NavRoute.Logs.route)    { PlaceholderScreen("Call Logs") }
        composable(NavRoute.Chat.route)    { PlaceholderScreen("Chat") }
        composable(NavRoute.Setting.route) { PlaceholderScreen("Settings") }
        // TODO: Register all sub-screens (contact detail, group detail, call screens, etc.)
    }
}

@Composable
private fun PlaceholderScreen(name: String) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text(name) }
}
