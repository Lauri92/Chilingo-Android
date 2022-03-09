package fi.lauriari.chilingo_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import fi.lauriari.chilingo_android.navigation.InitNavigation
import fi.lauriari.chilingo_android.ui.theme.ChilingoAndroidTheme
import fi.lauriari.chilingo_android.viewmodels.LoginViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChilingoAndroidTheme {
                navController = rememberNavController()
                InitNavigation(
                    navController = navController,
                    loginViewModel = loginViewModel
                )
            }
        }
    }
}