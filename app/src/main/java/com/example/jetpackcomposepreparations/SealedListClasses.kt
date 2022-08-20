package com.example.jetpackcomposepreparations

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection


sealed class SealedListClasses {
    data class CircleC(var radius:Float):SealedListClasses()
    class Rectangle(var length:Float, var breadth:Float):SealedListClasses()
    class Square(var length:Float):SealedListClasses()

    object NoShape :SealedListClasses( )

}