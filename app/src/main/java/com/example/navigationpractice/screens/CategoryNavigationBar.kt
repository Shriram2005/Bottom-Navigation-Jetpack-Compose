package com.example.navigationpractice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationpractice.CategoryScreen
import com.example.navigationpractice.CategoryScreenNavigation
import java.lang.reflect.Modifier


@Preview
@Composable
fun CategoryNavigation() {
    val navController2 = rememberNavController()

    Scaffold(
        topBar = {
            CategoryNavigationBar(navController2 = navController2)
        }
    ) {
        it
        Column() {
            CategoryScreenNavigation(navController2 = navController2)
        }
    }
}

@Composable
fun CategoryNavigationBar(navController2: NavController) {
    val items2 = listOf(
        CategoryScreen.Screen1,
        CategoryScreen.Screen2,
        CategoryScreen.Screen3,
        CategoryScreen.Screen4
    )
    var selectedIndex2 by remember { mutableIntStateOf(0) }

    NavigationBar(
        containerColor = Color.Transparent
    ) {
        items2.forEachIndexed { index, categoryScreen ->
            NavigationBarItem(
                selected = selectedIndex2 == index, onClick = {
                    navController2.navigate(categoryScreen.route)
                    selectedIndex2 = index
                },
                icon = {},
                label = {
                    Text(text = categoryScreen.title, fontSize = 14.sp)
                }, alwaysShowLabel = true

            )
        }
    }
}
