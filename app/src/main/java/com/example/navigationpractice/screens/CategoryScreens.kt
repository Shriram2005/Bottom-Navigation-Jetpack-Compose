package com.example.navigationpractice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Screen1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xF2AF91FF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "This is First inner page of inner navigation",
            fontSize = 32.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun Screen2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xF2AF91FF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "This is Second inner page of inner navigation",
            fontSize = 32.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun Screen3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xF2AF91FF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "This is Third inner page of inner navigation",
            fontSize = 32.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun Screen4() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xF2AF91FF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "This is Fourth inner page of inner navigation",
            fontSize = 32.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )
    }
}