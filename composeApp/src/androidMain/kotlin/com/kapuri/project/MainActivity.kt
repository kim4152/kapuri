package com.kapuri.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kapuri.project.ui.KapuriApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KapuriApp()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    KapuriApp()
}
