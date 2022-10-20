package com.adlagar8.runtimefontswitcher.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.adlagar8.runtimefontswitcher.R

@Composable
fun FontChooserScreen(){

    FontFinder()
    Text(stringResource(R.string.write_something))
}