package com.ttalk.app.navigation

// TODO: Add all sealed route definitions with typed create() helpers
sealed class NavRoute(val route: String) {
    object Home     : NavRoute("home")
    object Contact  : NavRoute("contact")
    object Group    : NavRoute("group")
    object Logs     : NavRoute("logs")
    object Chat     : NavRoute("chat")
    object Setting  : NavRoute("setting")
}
