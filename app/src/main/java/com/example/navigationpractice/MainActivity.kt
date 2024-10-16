package com.example.navigationpractice

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Transparent bg status bar
        window.statusBarColor = Color.Transparent.toArgb()
        // Set black or white status bar icons  // true = black
        WindowCompat.getInsetsController(window, window.decorView).isAppearanceLightStatusBars =
            true // or false


        setContent {
            MyApp()
        }
    }
}


@Preview
@Composable
private fun MyApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        it
        Column{
            NavigationGraph(navController = navController)
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        Screen.Home,
        Screen.Favorite,
        Screen.Mail,
        Screen.Profile
    )

    // Observe the backstack to get the current destination
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    // Get the current route
    val currentRoute = navBackStackEntry?.destination?.route

    // Update the selectedIndex based on the current route
    val selectedIndex = items.indexOfFirst { it.route == currentRoute }

    NavigationBar {
        items.forEachIndexed { index, screen ->
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = {
                    navController.navigate(screen.route) {
                        // This will prevent multiple copies of the same destination being in the backstack
//                        popUpTo(navController.graph.startDestinationId) {
//                            saveState = true
//                        }
                        // Avoid multiple copies of the same screen in the back stack
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = if (selectedIndex == index) screen.selectedIcon else screen.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = screen.title)
                },
                alwaysShowLabel = false
            )
        }
    }
}
