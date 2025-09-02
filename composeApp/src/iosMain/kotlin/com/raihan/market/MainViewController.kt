package com.raihan.market

import androidx.compose.ui.window.ComposeUIViewController
import com.raihan.di.initializeModule

fun MainViewController() = ComposeUIViewController(
    configure = { initializeModule() }
) { App() }