package com.gmail.evgenpatiy.openwrtinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gmail.evgenpatiy.openwrtinfo.ui.OpenWrtInfoComposeApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OpenWrtInfoComposeApp()
        }
    }
}
