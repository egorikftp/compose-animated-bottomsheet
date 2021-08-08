package com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.egoriku.animatedbottomsheet.bottomsheet.expanded.ui.RadioLogo

@Composable
fun TopSection(logoUrl: String, title: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RadioLogo(logoUrl)

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 48.dp, start = 16.dp, end = 16.dp),
            text = title,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.h6
        )
    }
}