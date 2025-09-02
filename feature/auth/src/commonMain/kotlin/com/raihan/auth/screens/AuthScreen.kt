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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mmk.kmpauth.firebase.google.GoogleButtonUiContainerFirebase
import com.raihan.core.FoodColor
import com.raihan.core.FoodFont
import com.raihan.core.Resources
import com.raihan.core.components.FoodButton
import com.raihan.core.components.FoodToast
import com.raihan.core.components.ToastType
import com.raihan.core.extentions.skeletonLoading
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun AuthScreen(onSuccess : () -> Unit) {
    val viewModel = koinViewModel<AuthViewModel>()
    var loadingSignIn by remember { mutableStateOf(false) }

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
            GoogleButtonUiContainerFirebase(
                linkAccount = false,
                onResult = { result ->
                    result.onSuccess { user ->
                        viewModel.createCustomer(
                            user,
                            onSuccess = {
                                onSuccess()
                                FoodToast.show("Sign In Success ${user?.displayName}")
                                loadingSignIn = false
                            },
                            onError = { error ->
                                FoodToast.show("Error $error", ToastType.ERROR)
                                loadingSignIn = false
                            }
                        )
                    }
                    result.onFailure { error ->
                        FoodToast.show("Sign In Failed $error", ToastType.ERROR)
                        loadingSignIn = false
                    }
                }
            ){
                FoodButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .skeletonLoading(loadingSignIn),
                    text = "Sign In With Google", iconStart = Resources.Icon.SignIn,
                    onClickButton = {
                        loadingSignIn = true
                        this@GoogleButtonUiContainerFirebase.onClick()
                    })
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
