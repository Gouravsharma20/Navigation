package wu.tutorials.navigations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import wu.tutorials.navigations.ui.theme.Dobara
import wu.tutorials.navigations.ui.theme.NavigationsTheme
import wu.tutorials.navigations.ui.theme.HomeScreen
import wu.tutorials.navigations.ui.theme.MenuListScreen
import wu.tutorials.navigations.ui.theme.Next

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route ) {
        composable(Home.route) {
            HomeScreen(navController)
        }
        composable(MenuList.route) {
            MenuListScreen(navController)
        }
        composable(Next.route) {
            Next(navController)
        }
        composable(Dobara.route) {
            Dobara()
        }
    }
    
}