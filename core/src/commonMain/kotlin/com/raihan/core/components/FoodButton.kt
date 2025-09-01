package com.raihan.core.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raihan.core.FoodColor
import com.raihan.core.extentions.skeletonLoading
import com.raihan.core.fontNunitoBold
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun FoodButton(
    text: String,
    modifier: Modifier = Modifier,
    iconStart: DrawableResource? = null,
    iconEnd: DrawableResource? = null,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    softWrap: Boolean = true,
    loadingHeight: Dp = 48.dp,
    containerButtonColor: Color = FoodColor.ButtonGreenColorApp,
    textColor: Color? = null,
    textStyle: TextStyle = TextStyle(fontFamily = fontNunitoBold(), fontWeight = FontWeight.Bold, fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    debounceTime: Long = 150L,
    buttonContentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    onClickButton: () -> Unit = {}
) {
    val coroutineScope = rememberCoroutineScope()

    var globalDebounce: Job? = null

    val debouncedOnClick = {
        if (globalDebounce?.isActive != true) {
            globalDebounce = coroutineScope.launch {
                try {
                    onClickButton()
                    delay(debounceTime)
                } finally {
                    globalDebounce = null
                }
            }
        }
    }

    if (isLoading) {
        Box(
            modifier = modifier.skeletonLoading(
                isLoading = true,
                height = loadingHeight,
                shape = RoundedCornerShape(24.dp)
            )
        )
    } else {
        Button(
            onClick = debouncedOnClick,
            shape = RoundedCornerShape(24.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = containerButtonColor,
                disabledContainerColor = FoodColor.ButtonGrayColorDisableApp,
                contentColor = FoodColor.White,
                disabledContentColor = FoodColor.White,
            ),
            enabled = isEnabled,
            modifier = modifier,
            contentPadding = buttonContentPadding
        ) {
            if (iconStart != null) {
                Icon(
                    contentDescription = text,
                    modifier = Modifier
                        .size(20.dp),
                    painter = painterResource(iconStart),
                )
                Spacer(modifier = Modifier.width(14.dp))
            }
            Text(
                text = text,
                style = textStyle,
                maxLines = 1,
                color = textColor ?: FoodColor.White,
                overflow = TextOverflow.Ellipsis,
                softWrap = softWrap,
            )
            if (iconEnd != null) {
                Spacer(modifier = Modifier.width(14.dp))
                Icon(
                    contentDescription = text,
                    painter = painterResource(iconEnd),
                )
            }
        }
    }
}