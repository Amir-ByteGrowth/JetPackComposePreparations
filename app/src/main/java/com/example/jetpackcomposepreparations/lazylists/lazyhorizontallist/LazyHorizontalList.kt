package com.example.jetpackcomposepreparations.lazylists.lazyhorizontallist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepreparations.R
import com.example.jetpackcomposepreparations.sample.SampleData

@Composable
fun CreateLazyHorizontalList() {

    LazyRow(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        items(SampleData.nameList) { name ->
            Box(modifier = Modifier.width(80.dp).height(50.dp)) {
                Text(text = name, modifier = Modifier.padding(top = 10.dp))
            }
            Divider(
                color = colorResource(id = R.color.black)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLazyHorizontalList() {
    CreateLazyHorizontalList()
}