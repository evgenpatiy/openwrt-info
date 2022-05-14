package com.gmail.evgenpatiy.openwrtinfo.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.gmail.evgenpatiy.openwrtinfo.ui.theme.OpenWrtInfoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OpenWrtInfoComposeApp() {
    OpenWrtInfoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Scaffold(
                topBar = {
                    MediumTopAppBar(
                        title = {
                            Text("METANIT.COM", fontSize = 22.sp)
                        }
                    )
                },
                bottomBar = {
                    BottomAppBar {
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Favorite,
                                contentDescription = "Избранное"
                            )
                        }
                        Spacer(Modifier.weight(1f, true))
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Информация о приложении"
                            )
                        }
                    }
                }
            ) {
                Text("Hello METANIT.COM $it")
            }
        }
    }
}