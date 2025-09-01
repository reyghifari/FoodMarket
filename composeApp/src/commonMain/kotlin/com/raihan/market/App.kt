package com.raihan.market

import androidx.compose.runtime.Composable
import com.raihan.core.FoodTheme
import com.raihan.navigation.SetupNavGraph
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    FoodTheme{
        SetupNavGraph()
    }
}