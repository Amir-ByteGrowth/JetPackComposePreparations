package com.example.jetpackcomposepreparations.animatedlists

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AnimateLazyVerticalList() {
    LazyColumn {
        items(AnimationListData.animationDataList) { item ->
            AnimateListItem(
                animationListItem = item,
            )
        }

    }

}

@Composable
fun AnimateListItem(animationListItem: AnimationListItem) {

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
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(
            top = 10.dp,
            start = 15.dp,
            end = 15.dp,
        )
    ) {
        Column(
            modifier = Modifier
                .padding(

                    bottom = extraPadding.coerceAtLeast(0.dp)
                )
                .fillMaxWidth()


        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 15.dp)
            ) {
                Text(

                    text = animationListItem.task,
                    style = MaterialTheme.typography.h4.copy(color = Color.White, fontSize = 18.sp)
                )
                Spacer(Modifier.weight(1f))
                Button(
                    onClick = { expanded = !expanded },
                    colors = ButtonDefaults.buttonColors(Color.White)
                ) {
                    Text(text = if (expanded) "Show less" else "Show more")
                }

            }

            Text(
                text = animationListItem.description,
                maxLines = 1,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                color = Color.White
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewLazyColumnVerticalList() {
    AnimateLazyVerticalList()
}