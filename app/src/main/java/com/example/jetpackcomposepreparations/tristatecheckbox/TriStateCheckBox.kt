package com.example.jetpackcomposepreparations.tristatecheckbox

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TriStateCheckBoxScreen() {
    val checkedState = remember { mutableStateOf(ToggleableState.Off) }
    Row (verticalAlignment = Alignment.CenterVertically){
        TriStateCheckbox(
            state = checkedState.value,
            onClick = {
                if (checkedState.value == ToggleableState.Indeterminate) {
                    checkedState.value = ToggleableState.Off
                } else if (checkedState.value == ToggleableState.Off) {
                    checkedState.value = ToggleableState.On
                } else checkedState.value = ToggleableState.Indeterminate
            },
            modifier = Modifier.padding(5.dp),
        )
        Text("Click", fontSize = 22.sp)
    }
}