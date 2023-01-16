package com.plexapp.tvcompose.demo.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plexapp.tvcompose.demo.ui.theme.Theme

@Composable
fun ComposeContentWrapper(content: @Composable () -> Unit) {
    Theme {
        Column(Modifier.padding(Theme.dimens.spacing_m))
        {
            Text(text = "Composable")
            content()
        }
    }
}
