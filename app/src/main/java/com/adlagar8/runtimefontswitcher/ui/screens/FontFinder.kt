package com.adlagar8.runtimefontswitcher.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FontFinder(onTextChanged: (String) -> Unit) {

    var currentText by remember { mutableStateOf("") }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        value = currentText,
        placeholder = { Text("Escribe el nombre de una fuente") },
        onValueChange = {
            currentText = it
            if (currentText.isNotEmpty()) {
                onTextChanged.invoke(it)
            }
        })

}