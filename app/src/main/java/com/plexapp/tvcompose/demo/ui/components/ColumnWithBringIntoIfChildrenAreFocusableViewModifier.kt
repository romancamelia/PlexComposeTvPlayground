package com.plexapp.tvcompose.demo.ui.components

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View.OnFocusChangeListener
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.TvLazyListState
import com.plexapp.tvcompose.demo.ui.theme.Theme
import com.plexapp.tvcompose.demo.utils.bringIntoViewIfChildrenAreFocused

class ColumnWithBringIntoIfChildrenAreFocusableViewModifier(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {
    private val dummyDefaultFocus = FocusRequester()
    private var currentFocus = dummyDefaultFocus

    init {
        this.isFocusable = true
        this.isFocusableInTouchMode = true

        this.onFocusChangeListener = OnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                currentFocus.requestFocus()
            }
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun Content() {
        ComposeContentWrapper {
            Column(Modifier.padding(Theme.dimens.spacing_l))
            {
                val state = remember { TvLazyListState() }
                Log.i(
                    "Scroll", "firstVisibleItemScrollOffset is ${
                        state.firstVisibleItemScrollOffset
                    }"
                )
                TvLazyColumn(
                    state = state,
                    verticalArrangement = Arrangement.spacedBy(Theme.dimens.spacing_m),
                    modifier = Modifier.focusRequester(dummyDefaultFocus)
                )
                {
                    items(10) { index ->
                        val interactionSource = remember { MutableInteractionSource() }
                        val focusRequester = remember(index) { FocusRequester() }

                        if (interactionSource.collectIsFocusedAsState().value)
                            currentFocus = focusRequester

                        BoxWithBringIntoViewIfChildrenAreFocused(
                            modifier = Modifier
                                .focusGroup()
                                .focusRequester(focusRequester)
                                .focusable(true, interactionSource)
                                .background(color = Color.White),
                            interactionSource = interactionSource
                        )
                    }
                }
            }
        }
    }
}


@Composable
private fun BoxWithBringIntoViewIfChildrenAreFocused(
    modifier: Modifier,
    interactionSource: MutableInteractionSource
) {
    Box(
        Modifier
            .height(300.dp)
            .width(200.dp)
            .bringIntoViewIfChildrenAreFocused()
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(20.dp), modifier = Modifier) {
            Box(
                modifier = modifier
                    .fillMaxHeight()
                    .width(180.dp)
                    .background(if (interactionSource.collectIsFocusedAsState().value) Color.Cyan else Color.Gray)
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                val interactionSource1 = remember { MutableInteractionSource() }
                Box(
                    modifier = Modifier
                        .requiredSize(Theme.dimens.spacing_xl)
                        .focusable(true, interactionSource1)
                        .background(if (interactionSource1.collectIsFocusedAsState().value) Color.Cyan else Color.Gray)
                )
                val interactionSource2 = remember { MutableInteractionSource() }
                Box(
                    modifier = Modifier
                        .requiredSize(Theme.dimens.spacing_xl)
                        .focusable(true, interactionSource2)
                        .background(if (interactionSource2.collectIsFocusedAsState().value) Color.Cyan else Color.Gray)
                )
            }
        }
    }
}

