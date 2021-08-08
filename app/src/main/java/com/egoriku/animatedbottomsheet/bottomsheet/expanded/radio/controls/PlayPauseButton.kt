package com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio.controls

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun PlayPauseButton(onClick: () -> Unit) {
    CircleIconButtonLarge(
        background = MaterialTheme.colors.primary,
        imageVector = Icons.Filled.PlayArrow,
        onClick = onClick
    )
}

@Composable
fun CircleIconButtonLarge(
    background: Color,
    imageVector: ImageVector,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(72.dp)
            .clip(CircleShape)
            .background(background, CircleShape)
            .clickable(
                indication = rememberRipple(bounded = true),
                interactionSource = remember { MutableInteractionSource() },
                onClick = { onClick() }
            )
    ) {
        Icon(imageVector = imageVector, contentDescription = null)
    }
}