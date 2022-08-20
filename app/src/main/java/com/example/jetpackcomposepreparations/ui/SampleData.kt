package com.example.jetpackcomposepreparations.ui

object SampleData {
    // Sample conversation data
    data class MessageData(val title: String, val body: String,var isExpanded:Boolean=false)

    val conversationSample = listOf(
        MessageData(
            "Colleague",
            "Test...Test...Test..."
        ),
        MessageData(
            "Colleague",
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n"
        ),
        MessageData(
            "Colleague",
            "I think Kotlin is my favorite programming language.\n" +
                    "It's so much fun!"
        ),
        MessageData(
            "Colleague",
            "Searching for alternatives to XML layouts..."
        ),
        MessageData(
            "Colleague",
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)"
        ),
        MessageData(
            "Colleague",
            "It's available from API 21+ :)"
        ),
        MessageData(
            "Colleague",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        MessageData(
            "Colleague",
            "Android Studio next version's name is Arctic Fox"
        ),
        MessageData(
            "Colleague",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        MessageData(
            "Colleague",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        MessageData(
            "Colleague",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        MessageData(
            "Colleague",
            "Previews are also interactive after enabling the experimental setting"
        ),
        MessageData(
            "Colleague",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}