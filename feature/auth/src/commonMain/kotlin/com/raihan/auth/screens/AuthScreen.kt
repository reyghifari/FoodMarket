package com.raihan.auth.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.raihan.core.FoodColor
import com.raihan.core.FoodFont
import com.raihan.core.Resources
import com.raihan.core.components.FoodButton
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AuthScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
            .padding(WindowInsets.systemBars.asPaddingValues())
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                "FOODMARKET",
                style = FoodFont.headlineExtraLarge(),
                color = FoodColor.Irish.Normal
            )
            Text(
                "Sign In to Continue",
                style = FoodFont.placeholderTextField(),
                color = FoodColor.JetBlack.Normal
            )
            Spacer(modifier = Modifier.weight(1f))
            FoodButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                text = "Sign In With Google", iconStart = Resources.Icon.SignIn,
                onClickButton = {

                })
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
@Preview
fun PreviewAuth() {
    AuthScreen()
}
