package com.example.jetpackcomposepreparations.composeablestates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun StateColumnItem(name: String, modifier: Modifier = Modifier) {

    var expanded by remember {
        mutableStateOf(false)
    }

    var bottomPadding by remember {
        mutableStateOf(30.dp)
    }

    if (expanded){
        bottomPadding=30.dp
    }else{
        bottomPadding=4.dp
    }

    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier
            .padding(24.dp)
            .padding(bottom =bottomPadding)) {

            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello World")
                Text(text = name)
            }

            SimpleButton( expanded, { expanded = !expanded })
        }

    }
}

// simple button
@Composable
fun SimpleButton(expanded: Boolean, onButtonClick: () -> Unit) {
    Button(
        onClick = onButtonClick,
        colors = ButtonDefaults.buttonColors(Color.White)

    ) {
        Text(text = if (expanded) "Show less" else "Show more")
    }
}