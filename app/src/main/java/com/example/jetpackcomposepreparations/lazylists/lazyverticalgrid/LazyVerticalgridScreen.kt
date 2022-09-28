package com.example.jetpackcomposepreparations.lazylists.lazyverticalgrid


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.R
import com.example.jetpackcomposepreparations.sample.SampleData


val colors = listOf(
    Color.Red,
    Color.Gray,
    Color.Cyan,
    Color.Blue,
    Color.LightGray,
    Color.Yellow,
    Color.Blue,
    Color.Red,
)

@Composable
fun LazyVerticalGridDynamicSpan() {
    val columnsCount = 3
    LazyVerticalGrid(
        columns = GridCells.Fixed(columnsCount),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        for (items in colors) {
            if (items == Color.Red) {
                item(span = { GridItemSpan(columnsCount) }) {
                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .background(items)
                    )
                }
            } else if (items == Color.Blue) {
                item(span = { GridItemSpan(2) }) {
                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .background(items)
                    )
                }
            } else {
                item {
                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .background(items)
                    )
                }
            }
        }


//        items(6) {
//
//
//        }
//        items(3, span = { GridItemSpan(columnsCount) }) {
//            Box(
//                modifier = Modifier
//                    .height(100.dp)
//                    .fillMaxWidth()
//                    .background(colors[it])
//            )
//        }

    }
}

@Composable
fun LazyVerticalGrids() {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        items(SampleData.nameList) { item ->
            Box(modifier = Modifier.height(70.dp)) {
                Text(
                    text = item,
                    modifier = Modifier.padding(top = 20.dp, start = 10.dp)
                )
            }
            Divider(
                color = colorResource(id = R.color.black)
            )
        }

    }
}