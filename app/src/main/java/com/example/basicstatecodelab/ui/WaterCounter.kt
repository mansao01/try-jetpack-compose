package com.example.basicstatecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.basicstatecodelab.WellnessTaskItem


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable{ mutableStateOf(0)}

    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text(text = "You have had $count glasses"  )
        }

        Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text(text = "Add one")
        }
    }
}