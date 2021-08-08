package com.egoriku.animatedbottomsheet.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = Color(0xFF009688),
    secondary = Color(0xFFFF9800)
)

@Composable
fun AnimatedbottomsheetTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = LightColorPalette,
        content = content
    )
}