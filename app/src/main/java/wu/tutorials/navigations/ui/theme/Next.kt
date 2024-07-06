package wu.tutorials.navigations.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import wu.tutorials.navigations.Dobara
import wu.tutorials.navigations.ui.theme.Dobara

@Composable
fun Next(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()
        ,verticalArrangement = Arrangement.Center) {
        Text(text = "Ho gya BHAI")
    }
    Button(onClick = { navController.navigate(Dobara.route) }) {
        Text(text = "ub kr")

    }
}