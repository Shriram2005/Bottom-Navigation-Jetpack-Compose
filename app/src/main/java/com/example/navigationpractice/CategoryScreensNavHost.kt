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
import com.example.navigationpractice.screens.Screen1
import com.example.navigationpractice.screens.Screen2
import com.example.navigationpractice.screens.Screen3
import com.example.navigationpractice.screens.Screen4


sealed class CategoryScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    val selectedIcon: ImageVector
) {
    data object Screen1 : CategoryScreen("screen1", "Shoes", Icons.Outlined.Home, Icons.Filled.Home)
    data object Screen2 : CategoryScreen("screen2", "Shirts", Icons.Outlined.Person, Icons.Filled.Person)
    data object Screen3 : CategoryScreen("screen3", "Pants", Icons.Outlined.FavoriteBorder, Icons.Outlined.Favorite)
    data object Screen4 : CategoryScreen("screen4", "Tops", Icons.Outlined.Email, Icons.Filled.Email)
}

@Composable
fun CategoryScreenNavigation(navController2: NavHostController) {
    NavHost(navController2, startDestination = CategoryScreen.Screen1.route) {
        composable(CategoryScreen.Screen1.route) { Screen1() }
        composable(CategoryScreen.Screen2.route) { Screen2() }
        composable(CategoryScreen.Screen3.route) { Screen3() }
        composable(CategoryScreen.Screen4.route) { Screen4() }
    }
}