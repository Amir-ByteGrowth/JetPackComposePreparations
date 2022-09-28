package com.example.jetpackcomposepreparations.backdropscafold

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

val options = listOf(
    "Jetpack Compose", "Material Design", "Work Manager",
    "Kotlin", "Coroutines", "Architecture"
)

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BackdropScaffoldScreen() {
    var backdropState = rememberBackdropScaffoldState(BackdropValue.Concealed)
    val selectedCategory = remember { mutableStateOf("") }
    var coroutineScope = rememberCoroutineScope()
    BackdropScaffold(
        scaffoldState = backdropState,
        appBar = {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Backdrop Scaffold",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth()
            )
        },
        backLayerContent = {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                options.forEach { option ->
                    TextOption(option = option, onOptionSelected = {
                        selectedCategory.value = it
                        coroutineScope.launch { backdropState.conceal() }


                    })
                }
            }
        }, frontLayerContent = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = selectedCategory.value)
                Spacer(Modifier.height(64.dp))
                TextButton(onClick = {
                    coroutineScope.launch {
                        backdropState.reveal()
                    }
                }) {
                    Text(text = "Select a different one?")
                }
            }

        }
    )

}

@Composable
fun TextOption(
    option: String,
    onOptionSelected: (option: String) -> Unit
) {
    Text(
        text = option,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.clickable {
            onOptionSelected(option)
        }
    )
}
