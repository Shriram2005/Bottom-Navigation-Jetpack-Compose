package com.example.navigationpractice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

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
            Text(text = "This is Screen 1", fontSize = 32.sp, fontWeight = FontWeight.Bold)
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