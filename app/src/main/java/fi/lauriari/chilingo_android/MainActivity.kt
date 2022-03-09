package fi.lauriari.chilingo_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import fi.lauriari.chilingo_android.navigation.InitNavigation
import fi.lauriari.chilingo_android.ui.theme.ChilingoAndroidTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChilingoAndroidTheme {
                navController = rememberNavController()
                InitNavigation(navController = navController)
            }
        }
    }
}