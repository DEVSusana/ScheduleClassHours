package views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import presentation.viewmodel.StudentViewModel
import views.composable.navigationComponent.NavigationComponent

@OptIn(KoinExperimentalAPI::class)
@Composable
fun App() {
    KoinContext {
        MaterialTheme {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                val viewModel = koinViewModel<StudentViewModel> ()
                val navController = rememberNavController()
                NavigationComponent(
                    navController = navController,
                    viewModel
                )
            }
        }
    }
}