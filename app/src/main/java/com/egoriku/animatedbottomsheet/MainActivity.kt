package com.egoriku.animatedbottomsheet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.egoriku.animatedbottomsheet.screen.HomeScreen
import com.egoriku.animatedbottomsheet.ui.theme.AnimatedbottomsheetTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AnimatedbottomsheetTheme() {
                HomeScreen()
            }
        }
    }
}