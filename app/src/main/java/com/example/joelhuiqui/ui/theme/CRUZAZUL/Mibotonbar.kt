package com.example.joelhuiqui.ui.theme.CRUZAZUL

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign

@Composable
fun MIbottomBar (){
    val items = listOf<BottomNavigation>(
        BottomNavigation("op1", Icons.Filled.Home, Icons.Outlined.Home, hasNews = false ),
        BottomNavigation( "op2", Icons.Filled.Favorite, Icons.Outlined.Favorite, hasNews = false ),
        BottomNavigation( "op3", Icons.Filled.Settings, Icons.Outlined.Settings, hasNews = false )

    )
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = { Icon(imageVector = item.unselectedIcon, contentDescription = item.title) })
        }
    }
}
