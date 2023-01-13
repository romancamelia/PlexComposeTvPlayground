@file:Suppress("ConstructorParameterNaming")

package com.plexapp.tvcompose.demo.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Dimens and explicit spacings to be used when theming.
 * https://design.plex.tv/1bc1d1cc7/p/28d5b0-sizes-
 * Note that for TV we divide the values by 2.
 */
@Immutable
data class Dimens internal constructor(
    // Spacings
    val spacing_xxxs: Dp,
    val spacing_xxs: Dp,
    val spacing_xs: Dp,
    val spacing_s: Dp,
    val spacing_m: Dp,
    val spacing_l: Dp,
    val spacing_xl: Dp,
    val spacing_xxl: Dp,
    val spacing_xxxl: Dp,

    val actionButtonWidth: Dp,
    val actionButtonHeight: Dp,
    val badgeIconSize: Dp,
    val badgeHeight: Dp,

    val tabBarHeight: Dp,

    // Item dimens.

    val cellHorizontalPadding: Dp,

    // Images
    val attributionLogoHeight: Dp = 22.5.dp,
    val attributionLogoWidth: Dp = 60.dp,

    // Preplay media location cards
    val preplayLocationCardHeight: Dp
)

private val tvDimens: Dimens by lazy(LazyThreadSafetyMode.NONE) {
    Dimens(
        spacing_xxxs = 1.dp,
        spacing_xxs = 2.dp,
        spacing_xs = 4.dp,
        spacing_s = 6.dp,
        spacing_m = 8.dp,
        spacing_l = 12.dp,
        spacing_xl = 16.dp,
        spacing_xxl = 24.dp,
        spacing_xxxl = 32.dp,

        actionButtonWidth = 64.dp,
        actionButtonHeight = 32.dp,
        badgeIconSize = 12.dp,
        badgeHeight = 20.dp,

        cellHorizontalPadding = 16.dp,
        tabBarHeight = 42.dp,

        preplayLocationCardHeight = 76.dp
    )
}

private val mobileDimens: Dimens by lazy(LazyThreadSafetyMode.NONE) {
    Dimens(
        spacing_xxxs = 2.dp,
        spacing_xxs = 4.dp,
        spacing_xs = 8.dp,
        spacing_s = 12.dp,
        spacing_m = 16.dp,
        spacing_l = 24.dp,
        spacing_xl = 32.dp,
        spacing_xxl = 48.dp,
        spacing_xxxl = 64.dp,

        actionButtonWidth = 24.dp,
        actionButtonHeight = 24.dp,

        badgeIconSize = 16.dp,
        badgeHeight = 24.dp,

        cellHorizontalPadding = 8.dp,
        tabBarHeight = 48.dp,

        preplayLocationCardHeight = 64.dp
    )
}

@Composable
internal fun platformDimens(): Dimens =
    tvDimens

