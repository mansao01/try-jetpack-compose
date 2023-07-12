package com.example.basicstatecodelab.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
        WaterCounter()
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview(){
    BasicStateCodelabTheme {
        WellnessScreen()
    }
}