package com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio.controls.PlayerControls

@Composable
fun RadioScreenLarge(
    icon: String,
    name: String
) {
    Surface {
        RadioPlayer(
            topSection = {
                TopSection(logoUrl = icon, title = name)
            },
            playerControls = {
                PlayerControls()
            }
        )
    }
}