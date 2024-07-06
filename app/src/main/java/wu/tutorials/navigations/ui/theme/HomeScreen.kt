package wu.tutorials.navigations.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import wu.tutorials.navigations.MenuList

@Composable
fun HomeScreen(navController: NavController) {
    Row (modifier = Modifier.fillMaxSize().padding(35.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top){
        Text(text = "ye hai row", fontSize = 32.sp)
        Button(onClick = { navController.navigate(MenuList.route) }) {
            Text(text = "NEXT")

        }
    }


}