package com.example.joelhuiqui.ui.theme.CRUZAZUL

import android.icu.text.CaseMap
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigation(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int?=null
)
