package com.raihan.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import foodmarket.core.generated.resources.Res
import foodmarket.core.generated.resources.nunito_bold
import foodmarket.core.generated.resources.nunito_medium
import foodmarket.core.generated.resources.nunito_regular
import foodmarket.core.generated.resources.nunito_semi_bold
import org.jetbrains.compose.resources.Font

@Composable
fun fontNunitoMedium() = FontFamily(
    Font(Res.font.nunito_medium, FontWeight.Medium)
)

@Composable
fun fontNunitoBold() = FontFamily(
    Font(Res.font.nunito_bold, FontWeight.Bold)
)

@Composable
fun fontNunitoRegular() = FontFamily(
    Font(Res.font.nunito_regular, FontWeight.Normal)
)

@Composable
fun fontNunitoSemiBold() = FontFamily(
    Font(Res.font.nunito_semi_bold, FontWeight.SemiBold)
)

object FontSize {
    const val EXTRA_SMALL = 10
    const val SMALL = 12
    const val REGULAR = 14
    const val EXTRA_REGULAR = 16
    const val MEDIUM = 18
    const val EXTRA_MEDIUM = 20
    const val LARGE = 30
    const val EXTRA_LARGE = 30
}
