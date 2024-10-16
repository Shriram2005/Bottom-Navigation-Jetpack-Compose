package com.example.navigationpractice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationpractice.BottomNavigationBar
import com.example.navigationpractice.CategoryScreen
import com.example.navigationpractice.CategoryScreenNavigation
import com.example.navigationpractice.NavigationGraph
import com.example.navigationpractice.Screen

@Preview
@Composable
fun HomeScreen() {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFA4FFE2)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // top navigation bar ui function
            CategoryNavigation()
        }
    }
}


@Preview
@Composable
fun FavouritesScreen() {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFCCB6A)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "This is Screen 2", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable
fun MailScreen() {
    Surface() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFF8660)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "This is Screen 3", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable
fun ProfileScreen() {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFA663FF)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "This is Screen 4", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }
    }
}