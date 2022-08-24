package com.example.jetpackcomposepreparations.sample


class SampleData {
    companion object {
        var nameList: List<String> = List(100) { "Name $it" }
    }
}
