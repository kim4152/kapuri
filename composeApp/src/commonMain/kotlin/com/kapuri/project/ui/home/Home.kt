package com.kapuri.project.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

@Composable
fun Home(
    navigateToRoute: () -> Unit,
    viewModel: HomeViewModel = provideHomeViewModel(),
){
    val text = viewModel.loginInfo.collectAsState()
    Column {
        Button(onClick = {  viewModel.kakaoLogin() }){
            Text("${text.value}")
        }

    }
}

@Composable
fun Second(
    navigateToRoute: () -> Unit
){
    Button(onClick = navigateToRoute){
        Text("toHome")
    }
}
