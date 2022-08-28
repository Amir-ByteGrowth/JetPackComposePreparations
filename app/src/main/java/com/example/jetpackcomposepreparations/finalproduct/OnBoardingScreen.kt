package com.example.jetpackcomposepreparations.finalproduct

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateOnBoardScreen(btnClick: () -> Unit) {
    Surface(color = MaterialTheme.colors.primary) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = "Welcome to basic learning", style = TextStyle(fontSize = 20.sp))
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = btnClick,
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier
                    .width(160.dp)
            ) {
                Text(text = "Continue")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCreateOnBoardScreen() {
    CreateOnBoardScreen({})
}