package views.composable.navigationComponent

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import presentation.viewmodel.StudentViewModel
import views.composable.splash.SplashScreen

@Composable
fun NavigationComponent(
    navController: NavHostController,
    viewModel: StudentViewModel
){
    NavHost(
        navController = navController,
        startDestination = DestinationScreen.SplashScreenDest.route
    ) {
        composable(DestinationScreen.SplashScreenDest.route) {
            SplashScreen(navController) //TODO pending delete the native splash in both platform
        }

    }

}