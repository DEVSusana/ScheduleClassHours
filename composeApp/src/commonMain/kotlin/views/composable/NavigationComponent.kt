package views.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import presentation.viewmodel.StudentViewModel

@Composable
fun NavigationComponent(
    navController: NavHostController,
    viewModel: StudentViewModel
){
    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") {
            //SplashScreen()
        }

    }

}