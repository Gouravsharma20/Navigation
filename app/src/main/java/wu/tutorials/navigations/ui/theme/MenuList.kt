package wu.tutorials.navigations.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import wu.tutorials.navigations.Next

@Composable
fun MenuListScreen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 150.dp), horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Bottom){
        Text(text = "aalu")
        Button(onClick = {navController.navigate(Next.route)}) {
            Text(text = "Next-1")

        }

    }

}