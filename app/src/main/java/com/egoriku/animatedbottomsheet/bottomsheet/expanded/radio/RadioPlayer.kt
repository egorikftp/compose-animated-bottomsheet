package com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun RadioPlayer(
    topSection: @Composable () -> Unit,
    playerControls: @Composable () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.8f)
                .background(MaterialTheme.colors.primary)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 36.dp)
            ) {
                topSection()
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
        ) {
            Spacer(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            bottomStartPercent = 100,
                            bottomEndPercent = 100
                        )
                    )
                    .background(MaterialTheme.colors.primary)
                    .height(36.dp)
                    .fillMaxWidth()
            )

            Box(
                modifier = Modifier
                    .padding(top = 36.dp)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                playerControls()
            }
        }
    }
}