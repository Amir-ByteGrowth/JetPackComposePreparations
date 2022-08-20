package com.example.jetpackcomposepreparations.buttons

import android.content.Context
import android.widget.Toast
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SimpleButton(context: Context) {
    Button(onClick = {
     Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
    },
        colors = ButtonDefaults.buttonColors(Color.White)

    ) {
        Text(text = "Simple Btn")
    }
}