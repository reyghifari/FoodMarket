package com.raihan.core.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.raihan.core.FoodColor
import com.raihan.core.FoodFont
import com.raihan.core.Resources
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource

@Composable
fun FoodToast() {
    var toastMessage by remember { mutableStateOf<String?>(null) }
    var toastType by remember { mutableStateOf<ToastType>(ToastType.SUCCESS) }

    LaunchedEffect(Unit) {
        FoodToast.init { message, type ->
            toastMessage = message
            toastType = type
        }
    }

    toastMessage?.let { message ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 16.dp,
                    vertical = WindowInsets.systemBars.asPaddingValues().calculateTopPadding()
                ),
            contentAlignment = Alignment.TopCenter
        ) {
            ToastFood(message, toastType)
        }

        LaunchedEffect(message) {
            delay(4000)
            toastMessage = null
        }
    }
}

@Composable
fun ToastFood(
    message: String,
    type: ToastType = ToastType.SUCCESS
) {
    val backgroundColor = when (type) {
        ToastType.SUCCESS -> FoodColor.TealGreen.Minus50
        ToastType.ERROR -> FoodColor.Crismon.Minus50
    }

    Box(
        modifier = Modifier
            .wrapContentSize()
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(30.dp)
            )
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                message,
                color = FoodColor.JetBlack.Normal,
                style = FoodFont.labelLarge(),
                modifier = Modifier.wrapContentSize()
            )
        }
    }
}

object FoodToast {
    private var showToast: ((String, ToastType) -> Unit)? = null

    fun init(toastHandler: (String, ToastType) -> Unit) {
        showToast = toastHandler
    }

    fun show(message: String, type: ToastType = ToastType.SUCCESS) {
        showToast?.invoke(message, type)
    }
}

enum class ToastType {
    SUCCESS,
    ERROR
}

