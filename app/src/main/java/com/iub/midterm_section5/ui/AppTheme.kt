package com.iub.midterm_section5.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = lightColorScheme(
        primary = Color(0xFFB72A33),
        primaryContainer = Color(0xFFA262E),
        secondary = Color(0xFFF03C4DD),
        secondaryContainer = Color(0xFF03B2C9),
    )

    MaterialTheme(
        colorScheme = colorScheme
    ) {
        content()
    }
}