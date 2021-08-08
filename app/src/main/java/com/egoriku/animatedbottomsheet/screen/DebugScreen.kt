package com.egoriku.animatedbottomsheet.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.egoriku.animatedbottomsheet.extension.currentFraction

@Composable
@ExperimentalMaterialApi
fun DebugScreen(
    scaffoldState: BottomSheetScaffoldState,
    onToggle: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val fraction = scaffoldState.bottomSheetState.progress.fraction
        val targetValue = scaffoldState.bottomSheetState.targetValue
        val currentValue = scaffoldState.bottomSheetState.currentValue

        Text("fraction = $fraction")
        Text("target = $targetValue")
        Text("current = $currentValue")
        Text("New fraction = ${scaffoldState.currentFraction}")

        Button(
            modifier = Modifier.padding(20.dp),
            onClick = onToggle
        ) {
            Text(text = "Click to show/hide bottom sheet")
        }
    }
}