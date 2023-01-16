package com.plexapp.tvcompose.demo.ui.components

import android.content.Context
import android.util.AttributeSet
import android.view.View.OnFocusChangeListener
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp
import com.plexapp.tvcompose.demo.ui.theme.Theme

class SimpleBox(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {
    private var defaultFocusRequester = FocusRequester()
    private var currentFocus = defaultFocusRequester

    // See FocusTransferDemo
    // Commenting this would require an additional key event towards the component in order to get focus.
    // My assumption is that [FocusOwnerImpl#takeFocus] is the culprit.
    init {
        this.isFocusable = true
        this.isFocusableInTouchMode = true

        this.onFocusChangeListener = OnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                currentFocus.requestFocus()
            }
        }
    }

    @Composable
    override fun Content() {
        ComposeContentWrapper {
            val interactionSource = remember { MutableInteractionSource() }
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .focusRequester(defaultFocusRequester)
                    .focusable(true, interactionSource)
                    .background(
                        if (interactionSource.collectIsFocusedAsState().value)
                            Theme.colors.backgroundAccentFocus else Theme.colors.backgroundCard
                    )
            ) {
                Text(
                    "Compose box", modifier = Modifier
                        .align(Alignment.Center)
                        .padding(Theme.dimens.spacing_m)
                )
            }
        }
    }
}