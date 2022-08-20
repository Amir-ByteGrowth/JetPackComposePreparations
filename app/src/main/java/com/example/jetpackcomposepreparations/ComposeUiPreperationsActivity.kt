package com.example.jetpackcomposepreparations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.ui.theme.JetPackComposePreparationsTheme

class ComposeUiPreperationsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposePreparationsTheme {
                // A surface container using the 'background' color from the theme
                columnMyApp()

            }
        }
    }
}


@Composable
fun columnMyApp(names: List<String> = listOf("Amir", "Rashid")) {

    Surface(color = MaterialTheme.colors.background, modifier = Modifier.padding(vertical = 4.dp)) {
        Column {
            names.forEach { name -> columnItem(name = name) }
        }
    }
}

@Composable
fun columnItem(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp).fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(24.dp)) {
            Text(text = "Hello World")
            Text(text = name)
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
        Greeting6("Android")
    }
}