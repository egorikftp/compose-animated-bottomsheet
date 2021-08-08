package com.egoriku.animatedbottomsheet.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.egoriku.animatedbottomsheet.R
import com.egoriku.animatedbottomsheet.bottomsheet.SheetContent
import com.egoriku.animatedbottomsheet.bottomsheet.collapsed.SheetCollapsed
import com.egoriku.animatedbottomsheet.bottomsheet.collapsed.radio.RadioScreenSmall
import com.egoriku.animatedbottomsheet.bottomsheet.expanded.SheetExpanded
import com.egoriku.animatedbottomsheet.bottomsheet.expanded.radio.RadioScreenLarge
import com.egoriku.animatedbottomsheet.extension.currentFraction
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen() {
    val scope = rememberCoroutineScope()

    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed)
    )

    val sheetToggle: () -> Unit = {
        scope.launch {
            if (scaffoldState.bottomSheetState.isCollapsed) {
                scaffoldState.bottomSheetState.expand()
            } else {
                scaffoldState.bottomSheetState.collapse()
            }
        }
    }

    val logoUrl = "http://cdn.saleminteractivemedia.com/shared/images/logos/106/template3_logo.png"
    val title = "KYCR 1440 \"Twin Cities Business Radio\" Golden Valley, MN"

    val radius = (30 * scaffoldState.currentFraction).dp

    BottomSheetScaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState,
        sheetShape = RoundedCornerShape(topStart = radius, topEnd = radius),
        topBar = { TopBar() },
        sheetContent = {
            SheetContent {
                SheetExpanded {
                    RadioScreenLarge(icon = logoUrl, name = title)
                }
                SheetCollapsed(
                    isCollapsed = scaffoldState.bottomSheetState.isCollapsed,
                    currentFraction = scaffoldState.currentFraction,
                    onSheetClick = sheetToggle
                ) {
                    RadioScreenSmall(icon = logoUrl, name = title)
                }
            }
        },
        sheetPeekHeight = 72.dp
    ) {
        DebugScreen(scaffoldState = scaffoldState, onToggle = sheetToggle)
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold)
        )
    }
}
