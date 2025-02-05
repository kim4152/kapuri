package com.kapuri.project.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.kapuri.project.ui.home.Home
import com.kapuri.project.ui.home.Second
import kotlinx.coroutines.runBlocking


@Composable
actual fun KapuriScaffoldContent(
    innerPadding: PaddingValues,
    appState: KapuriAppState,
) {
    NavHost(
        startDestination = MainDestinations.HOME_ROUTE,
        modifier = Modifier.padding(innerPadding),
        navController = appState.navController,
    ) {
        composable(MainDestinations.HOME_ROUTE){
            // home
//            Home{
//                appState.navigateToSecond(MainDestinations.SECOND)
//            }
            //TestCompose()
            Home({})
        }
        composable(MainDestinations.SECOND){
            Second {
                appState.navigateToHome(MainDestinations.HOME_ROUTE)
            }
        }
    }
}

@Composable
fun TestCompose(){
    Button(
        onClick = { asdf() }
    ) { Text("naver") }
}

fun asdf()= runBlocking{
    //getKakaoLoginUrl()
}
