package com.example.navigationpractice

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationpractice.screens.FavouritesScreen
import com.example.navigationpractice.screens.HomeScreen
import com.example.navigationpractice.screens.MailScreen
import com.example.navigationpractice.screens.ProfileScreen


sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    val selectedIcon: ImageVector
) {
    data object Home : Screen("home", "Home", Icons.Outlined.Home, Icons.Filled.Home)
    data object Profile : Screen("profile", "Profile", Icons.Outlined.Person, Icons.Filled.Person)
    data object Favorite : Screen("favorite", "Favorite", Icons.Outlined.FavoriteBorder, Icons.Outlined.Favorite)
    data object Mail : Screen("mail", "Mail", Icons.Outlined.Email, Icons.Filled.Email)
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Favorite.route) { FavouritesScreen() }
        composable(Screen.Profile.route) { ProfileScreen() }
        composable(Screen.Mail.route) { MailScreen() }
    }
}