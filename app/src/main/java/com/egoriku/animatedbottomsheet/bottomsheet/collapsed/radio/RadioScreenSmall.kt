package com.egoriku.animatedbottomsheet.bottomsheet.collapsed.radio

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.egoriku.animatedbottomsheet.bottomsheet.collapsed.ui.RadioLogoSmall

@Composable
fun RowScope.RadioScreenSmall(
    icon: String,
    name: String
) {
    RadioLogoSmall(
        modifier = Modifier.padding(start = 16.dp),
        logoUrl = icon
    )
    Text(
        modifier = Modifier
            .weight(1f)
            .padding(start = 16.dp),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        text = name,
        color = MaterialTheme.colors.onPrimary,
        style = MaterialTheme.typography.caption
    )
    IconButton(
        onClick = { },
        modifier = Modifier.padding(
            start = 8.dp,
            top = 8.dp,
            bottom = 8.dp,
            end = 16.dp
        )
    ) {
        Icon(
            imageVector = Icons.Filled.Favorite,
            tint = MaterialTheme.colors.onPrimary,
            contentDescription = null
        )
    }
}