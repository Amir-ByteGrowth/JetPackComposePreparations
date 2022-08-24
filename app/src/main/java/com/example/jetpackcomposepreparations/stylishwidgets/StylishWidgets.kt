package com.example.jetpackcomposepreparations.stylishwidgets

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StylishTextView() {
    val shape = CircleShape
    Box(
        contentAlignment = Alignment.Center, modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(
            text = "Stylish Text",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(width = 2.dp, color = MaterialTheme.colors.secondary, shape = shape)
                .background(color = MaterialTheme.colors.primary, shape = shape)
                .padding(15.dp),
            textAlign = TextAlign.Center
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewStylishText() {
    StylishTextView()
}