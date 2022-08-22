package com.example.jetpackcomposepreparations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.buttons.*
import com.example.jetpackcomposepreparations.buttons.DifferentButton
import com.example.jetpackcomposepreparations.composeablestates.StateColumnItem
import com.example.jetpackcomposepreparations.statehoisting.OnBoardingScreen
import com.example.jetpackcomposepreparations.ui.theme.JetPackComposePreparationsTheme

class ComposeUiPreperationsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposePreparationsTheme {
                // A surface container using the 'background' color from the theme
                StateHoistMyApp()

            }
        }
    }
}

@Composable
fun StateHoistMyApp() {
    var btnClick by remember {
        mutableStateOf(false)
    }

    if (btnClick) {
        columnMyApp()
    } else {
        OnBoardingScreen { btnClick = !btnClick }
    }

}


@Composable
fun columnMyApp(names: List<String> = listOf("Amir", "Rashid")) {

    Surface(color = MaterialTheme.colors.background, modifier = Modifier.padding(vertical = 4.dp)) {
        Column {
            names.forEach { name -> StateColumnItem(name = name) }
        }
    }
}

@Composable
fun columnItem(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(24.dp)) {

            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello World")
                Text(text = name)
            }

            ElevatedButton(context = LocalContext.current)
        }

    }
}


@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Greeting6("MyAndroid")
    }
}


@Composable
fun Greeting6(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Text(text = "Hello $name!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview6() {
    JetPackComposePreparationsTheme {
        columnItem("Amir")
    }
}