package com.susanadev.scheduleclasshours

import views.App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import com.susanadev.scheduleclasshours.database.getDatabaseBuilder
import data.database.getRoomDatabase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
   App()
}