package com.raihan.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
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
    val EXTRA_SMALL = 10.sp
    val SMALL = 12.sp
    val REGULAR = 14.sp
    val EXTRA_REGULAR = 16.sp
    val MEDIUM = 18.sp
    val EXTRA_MEDIUM = 20.sp
    val LARGE = 30.sp
    val EXTRA_LARGE = 40.sp
}

object FoodFont {
    @Composable
    fun headlineExtraLarge() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.EXTRA_LARGE,
        lineHeight = 48.sp
    )

    @Composable
    fun headlineLarge() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.LARGE,
        lineHeight = 40.sp
    )

    @Composable
    fun headlineMediumBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.MEDIUM,
        lineHeight = 26.sp
    )

    @Composable
    fun headlineMedium() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.EXTRA_MEDIUM,
        lineHeight = 28.sp
    )

    @Composable
    fun headlineSmall() = TextStyle(
        fontFamily = fontNunitoRegular(),
        fontSize = 26.sp,
        lineHeight = 32.sp
    )

    @Composable
    fun titleLargeBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = 23.sp,
        lineHeight = 36.sp
    )

    @Composable
    fun titleLarge() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.EXTRA_MEDIUM,
        lineHeight = 36.sp
    )

    @Composable
    fun titleMediumBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.REGULAR,
        lineHeight = 26.sp
    )

    @Composable
    fun titleMedium() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.REGULAR,
        lineHeight = 26.sp
    )

    @Composable
    fun titleSmallBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 24.sp
    )

    @Composable
    fun titleSmall() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 24.sp
    )

    @Composable
    fun bodyLargeBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.EXTRA_REGULAR,
        lineHeight = 22.sp
    )

    @Composable
    fun bodyLarge() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.EXTRA_REGULAR,
        lineHeight = 22.sp
    )

    @Composable
    fun bodyMediumBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.REGULAR,
        lineHeight = 20.sp
    )

    @Composable
    fun bodyMedium() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.REGULAR,
        lineHeight = 20.sp
    )

    @Composable
    fun bodySmallBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 18.sp
    )

    @Composable
    fun bodySmall() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 18.sp
    )

    @Composable
    fun labelLarge() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 18.sp
    )

    @Composable
    fun labelLargeBold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 18.sp
    )

    @Composable
    fun labelMedium() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.EXTRA_SMALL,
        lineHeight = 16.sp
    )

    @Composable
    fun labelSmall() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = 8.sp,
        lineHeight = 14.sp
    )

    @Composable
    fun labelTextField() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 18.sp
    )

    @Composable
    fun placeholderTextField() = TextStyle(
        fontFamily = fontNunitoRegular(),
        fontSize = FontSize.REGULAR,
        lineHeight = 24.sp
    )

    @Composable
    fun placeholderTextFieldTransactionEmas() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.MEDIUM,
        lineHeight = 26.sp
    )

    @Composable
    fun valueTextField() = TextStyle(
        color = FoodColor.FocusTextField,
        fontFamily = fontNunitoRegular(),
        fontSize = FontSize.REGULAR,
        lineHeight = 24.sp
    )

    @Composable
    fun errorTextField() = TextStyle(
        fontFamily = fontNunitoRegular(),
        fontSize = FontSize.SMALL,
        lineHeight = 14.sp
    )

    @Composable
    fun buttonText() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = FontSize.EXTRA_REGULAR,
        lineHeight = 24.sp
    )

    @Composable
    fun label12NormalNoLineHeight() = TextStyle(
        fontFamily = fontNunitoRegular(),
        fontSize = FontSize.SMALL
    )

    @Composable
    fun label12SemiBoldNoLineHeight() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.SMALL
    )

    @Composable
    fun label12SemiBold() = TextStyle(
        fontFamily = fontNunitoSemiBold(),
        fontSize = FontSize.SMALL,
        lineHeight = 18.sp
    )

    @Composable
    fun label24Bold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = 24.sp,
        lineHeight = 36.sp
    )

    @Composable
    fun label20Bold() = TextStyle(
        fontFamily = fontNunitoBold(),
        fontSize = 20.sp,
        lineHeight = 36.sp
    )
}
