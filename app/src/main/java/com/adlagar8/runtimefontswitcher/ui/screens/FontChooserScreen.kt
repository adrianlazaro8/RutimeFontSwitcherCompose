package com.adlagar8.runtimefontswitcher.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adlagar8.runtimefontswitcher.R
import com.adlagar8.runtimefontswitcher.fontFamily
import com.adlagar8.runtimefontswitcher.provider

@OptIn(ExperimentalTextApi::class)
@Composable
fun FontChooserScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        var fontFamily by remember { mutableStateOf(fontFamily) }

        FontFinder {
            val fontName = GoogleFont(it)
            fontFamily = FontFamily(
                Font(googleFont = fontName, fontProvider = provider)
            )
        }
        Card(
            backgroundColor = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 8.dp,
                )
        ) {
            Text(
                fontFamily = fontFamily,
                text = stringResource(R.string.write_something),
                color = Color.White,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            )
        }
    }
}