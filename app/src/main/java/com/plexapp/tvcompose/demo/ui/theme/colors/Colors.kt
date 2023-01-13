package com.plexapp.tvcompose.demo.ui.theme.colors

import androidx.compose.ui.graphics.Color

/**
 * Colors
 * https://www.figma.com/file/W9r9Z5gT3cEruROlS2pcVvME/Colors?node-id=928%3A4946
 */
@Suppress("LongParameterList", "ConstructorParameterNaming")
data class Colors internal constructor(
    /** Color for foreground element backgrounds (buttons, list cells, etc) **/
    val primaryBackground100: Color,
    /** Color for foreground element backgrounds (buttons, list cells, etc) **/
    val primaryBackground80: Color,
    /** Color for foreground element backgrounds (buttons, list cells, etc) **/
    val primaryBackground60: Color,
    /** Color for foreground element backgrounds (buttons, list cells, etc) **/
    val primaryBackground30: Color,
    /** Color for foreground element backgrounds (buttons, list cells, etc) **/
    val primaryBackground10: Color,
    /** Color for foreground element backgrounds (buttons, list cells, etc) **/
    val primaryBackground5: Color,

    /** Color used for labels / icons etc... on top of the primary color. **/
    val primaryForeground100: Color,
    /** Color used for labels / icons etc... on top of the primary color. **/
    val primaryForeground80: Color,
    /** Color used for labels / icons etc... on top of the primary color. **/
    val primaryForeground60: Color,
    /** Color used for labels / icons etc... on top of the primary color. **/
    val primaryForeground30: Color,
    /** Color used for labels / icons etc... on top of the primary color. **/
    val primaryForeground10: Color,
    /** Color used for labels / icons etc... on top of the primary color. **/
    val primaryForeground5: Color,

    /** Color most often used for the fill color of a background containers (ie. the app background, overlay, etc) **/
    val surfaceBackground100: Color,
    /** Color most often used for the fill color of a background containers (ie. the app background, overlay, etc) **/
    val surfaceBackground80: Color,
    /** Color most often used for the fill color of a background containers (ie. the app background, overlay, etc) **/
    val surfaceBackground60: Color,
    /** Color most often used for the fill color of a background containers (ie. the app background, overlay, etc) **/
    val surfaceBackground30: Color,
    /** Color most often used for the fill color of a background containers (ie. the app background, overlay, etc) **/
    val surfaceBackground10: Color,
    /** Color most often used for the fill color of a background containers (ie. the app background, overlay, etc) **/
    val surfaceBackground5: Color,

    /** Color generally applied to text and icons on the respective surface. **/
    val surfaceForeground100: Color,
    /** Color generally applied to text and icons on the respective surface. **/
    val surfaceForeground80: Color,
    /** Color generally applied to text and icons on the respective surface. **/
    val surfaceForeground60: Color,
    /** Color generally applied to text and icons on the respective surface. **/
    val surfaceForeground30: Color,
    /** Color generally applied to text and icons on the respective surface. **/
    val surfaceForeground10: Color,
    /** Color generally applied to text and icons on the respective surface. **/
    val surfaceForeground5: Color,

    val textPrimary: Color,
    val textDefault: Color,
    val textMuted: Color,
    val textAccent: Color,
    val textOnFocus: Color,
    val textOnAccent: Color,
    val textAlert: Color,
    val textOnAlert: Color,
    val textConfirm: Color,
    val textOnConfirm: Color,
    val backgroundBackdrop: Color,
    val backgroundControl: Color,
    val backgroundCard: Color,
    val backgroundModal: Color,
    val backgroundFocus: Color,
    val backgroundAccent: Color,
    val backgroundAlert: Color,
    val backgroundAlertMuted: Color,
    val backgroundConfirm: Color,
    val backgroundSuccess: Color,
    val backgroundInformative: Color,
    val backgroundAccentFocus: Color,
    val backgroundAlertFocus: Color,
    val backgroundControlFocus: Color,
    val highlightFocus: Color,
    val highlightControlFocus: Color,
    val highlightAlert: Color,
    val highlightSuccess: Color,
    val highlightInformative: Color,
    val highlightModal: Color,

    /** Ultrablur corner colors **/
    val ultrablurBl: Color,
    val ultrablurTl: Color,
    val ultrablurTr: Color,
    val ultrablurBr: Color,

    val alertHighlight: Color,
    val confirmHighlight: Color,
    val overlayBackground: Color,

    /** Static Colors **/
    val brandAccent: Color,
    val staticPerrywinkle: Color,
    val staticYellow: Color,
    val staticGrey1: Color,
    val staticGrey2: Color,
    val staticGrey3: Color,
    val staticGrey4: Color,
    val staticGrey5: Color,
    val staticGrey6: Color,
    val staticGrey7: Color,
    val staticGrey8: Color,
    val staticRed: Color,
    val staticGreen: Color,
    val staticWhite: Color,

    val isDark: Boolean = false
)

/** Deprecated - replace with color from palette as soon as possible. **/
val Colors.backgroundAlt get() = Color(0xFF24272B)
val Colors.bottomSheetBackground get() = Color(0xFF343A3F)
