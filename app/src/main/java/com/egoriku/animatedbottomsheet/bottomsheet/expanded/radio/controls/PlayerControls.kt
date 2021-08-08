package com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio.controls

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.NotInterested
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.Tune
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlayerControls(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .padding(start = 16.dp, top = 8.dp, bottom = 8.dp, end = 8.dp)
        ) {
            Image(
                imageVector = Icons.Filled.NotInterested,
                contentDescription = "Not interested"
            )
        }

        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier
                    .padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 16.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.Tune,
                    contentDescription = "Tune"
                )
            }

            PlayPauseButton(onClick = {})

            IconButton(
                onClick = { },
                modifier = Modifier
                    .padding(start = 16.dp, top = 8.dp, bottom = 8.dp, end = 8.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.SkipNext,
                    contentDescription = "Skip Next"
                )
            }
        }

        IconButton(
            onClick = { },
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 16.dp)
        ) {
            Image(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Add favorite"
            )
        }
    }
}