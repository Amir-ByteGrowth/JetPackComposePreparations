package com.example.jetpackcomposepreparations.animatedlists

class AnimationListData {
    companion object {
        val animationDataList = List(15) {
            AnimationListItem(
                task = "Task #$it",
                "Desc# $it here we will give information of our widget"
            )
        }
    }
}

data class AnimationListItem(val task: String, val description: String)