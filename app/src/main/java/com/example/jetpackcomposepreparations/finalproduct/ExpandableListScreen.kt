package com.example.jetpackcomposepreparations.finalproduct

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.animatedlists.AnimationListData
import com.example.jetpackcomposepreparations.animatedlists.AnimationListItem

@Composable
fun CreateExpandableList() {


    Surface {
        LazyColumn {
            items(AnimationListData.expandableDataList) { item ->
                ExpandableListItem(item)

            }
        }
    }
}

@Composable
fun ExpandableListItem(animationListItem: AnimationListItem) {
    var expanded by remember {
        mutableStateOf(false)
    }

    val extraPadding by animateDpAsState(
        if (expanded) 55.dp else 10.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        )
    )
    Surface(
        color = MaterialTheme.colors.secondary, modifier = Modifier
            .padding(
                start = 10.dp,
                end = 10.dp,
                top = 10.dp,

                )
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 10.dp,
                    bottom = extraPadding.coerceAtLeast(10.dp)
                )
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier.padding(20.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = animationListItem.task, Modifier.weight(1f))
                IconButton(
                    onClick = { expanded = !expanded }
                ) {
                    Icon(

                        imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                        contentDescription = if (expanded) "Show more" else "Show less"
                    )
                }
            }

            if (expanded) {
                Text(
                    text = animationListItem.description,
                    modifier = Modifier.padding(horizontal = 15.dp, vertical = 10.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewExpandableList() {
    ExpandableListItem(AnimationListItem("Task 1", "Here is data"))
}