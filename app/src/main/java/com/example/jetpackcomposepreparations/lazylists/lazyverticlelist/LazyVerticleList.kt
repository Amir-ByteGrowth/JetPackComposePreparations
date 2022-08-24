package com.example.jetpackcomposepreparations.lazylists.lazyverticlelist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.R
import com.example.jetpackcomposepreparations.sample.SampleData


@Composable
fun CreateLazyVerticalList() {
    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight(), verticalArrangement = Arrangement.Center
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

@Preview(showBackground = true)
@Composable
fun PreviewVerticalLazyList() {
    CreateLazyVerticalList()
}