package com.ttalk.app.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Chat
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomNavBar(navController: NavController, currentRoute: String?) {
    NavigationBar {
        listOf(
            Triple(NavRoute.Home.route,    "Home",    Icons.Rounded.Home),
            Triple(NavRoute.Contact.route, "Contacts",Icons.Rounded.Contacts),
            Triple(NavRoute.Group.route,   "Groups",  Icons.Rounded.Group),
            Triple(NavRoute.Logs.route,    "Logs",    Icons.Rounded.History),
            Triple(NavRoute.Chat.route,    "Chat",    Icons.AutoMirrored.Rounded.Chat),
        ).forEach { (route, label, icon) ->
            NavigationBarItem(
                selected = currentRoute == route,
                onClick  = { navController.navigate(route) { launchSingleTop = true } },
                icon     = { Icon(icon, label) },
                label    = { Text(label) }
            )
        }
    }
}
