package com.plexapp.tvcompose.demo.ui.theme

import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.staticCompositionLocalOf
import com.plexapp.tvcompose.demo.ui.theme.colors.Colors
import com.plexapp.tvcompose.demo.ui.theme.colors.darkColors


@Composable
fun Theme(
    themeColors: Colors = Theme.themeColors.value,
    content: @Composable
        () -> Unit
) {

    CompositionLocalProvider(
        LocalThemeColors provides themeColors,
    ) {
        content()
    }
}

internal val LocalThemeColors = staticCompositionLocalOf { darkColors }

object Theme {
    internal val themeColors = mutableStateOf(darkColors)

    val colors: Colors
        @Composable
        get() = LocalThemeColors.current

    val dimens: Dimens
        @Composable
        get() = platformDimens()

    fun setTheme(colors: Colors) {
        themeColors.value = colors
    }
}
