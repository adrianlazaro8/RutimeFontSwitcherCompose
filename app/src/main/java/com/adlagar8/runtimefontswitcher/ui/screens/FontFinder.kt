package com.adlagar8.runtimefontswitcher.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.adlagar8.runtimefontswitcher.R

@Composable
fun FontFinder(onTextChanged: (String) -> Unit) {

    var currentText by remember { mutableStateOf("") }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        value = currentText,
        placeholder = { Text(stringResource(R.string.write_typography_name)) },
        onValueChange = {
            currentText = it
            if (currentText.isNotEmpty()) {
                onTextChanged.invoke(it)
            }
        })

}