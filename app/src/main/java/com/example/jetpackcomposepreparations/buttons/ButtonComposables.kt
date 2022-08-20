package com.example.jetpackcomposepreparations.buttons

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.R

// simple button
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


// multiText button
@Composable
fun MultiTextButton(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(Color.White)

    ) {
        Text(text = "Multi", color = Color.Green)
        Text(text = "Color", color = Color.Red)
    }
}

// Icon button
@Composable
fun IconButton(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(Color.White),

        ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Cart button icon",
            modifier = Modifier
                .size(40.dp)
                .padding(end = 10.dp)
        )
        Text(text = "Icon Button")

    }
}


// Different shape button
@Composable
fun DifferentButton(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(Color.White),
        shape = CutCornerShape(10.dp)
//        shape = CircleShape
//        shape = RoundedCornerShape(10.dp)
//        shape = RectangleShape
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Cart button icon",
            modifier = Modifier
                .size(40.dp)
                .padding(end = 10.dp)
        )
        Text(text = "Icon Button")

    }
}

// Border of button
@Composable
fun BorderButton(context: Context) {
    Button(onClick = {
        Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
    },
        colors = ButtonDefaults.buttonColors(Color.White),
        border = BorderStroke(2.dp, Color.Magenta),
        shape = RoundedCornerShape(15.dp)

    ) {
        Text(text = "Border Btn")
    }
}

// Elevation of button
@Composable
fun ElevatedButton(context: Context) {
    Button(onClick = {
        Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
    },
        colors = ButtonDefaults.buttonColors(Color.White),
        elevation = ButtonDefaults.elevation(defaultElevation = 5.dp, disabledElevation = 2.dp, pressedElevation = 10.dp)
        

    ) {
        Text(text = "Border Btn")
    }
}