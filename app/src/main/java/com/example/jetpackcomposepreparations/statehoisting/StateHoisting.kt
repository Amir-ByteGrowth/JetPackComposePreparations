package com.example.jetpackcomposepreparations.statehoisting

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OnBoardingScreen(onButtonClick:() -> Unit) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Welcome to the basic code lab")
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = onButtonClick) {
                Text(text = "Continue")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun showOnBoardingScreen(){
   OnBoardingScreen({})
}