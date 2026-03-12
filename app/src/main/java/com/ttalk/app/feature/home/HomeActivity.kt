package com.ttalk.app.feature.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ttalk.app.core.theme.TTalkTheme
import com.ttalk.app.navigation.BottomNavBar
import com.ttalk.app.navigation.TTalkNavGraph
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.ttalk.app.core.ui.GlobalUiViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TTalkTheme {
                val navController = rememberNavController()
                val currentRoute by navController.currentBackStackEntryAsState()
                val globalUiViewModel: GlobalUiViewModel = hiltViewModel()
                Scaffold(
                    bottomBar = { BottomNavBar(navController, currentRoute?.destination?.route) }
                ) { innerPadding ->
                    TTalkNavGraph(navController, globalUiViewModel, Modifier.padding(innerPadding))
                }
            }
        }
    }
}
