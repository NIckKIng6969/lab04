package com.example.moviecounter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviecounter.ui.theme.MovieCounterTheme

// Componente del laboratorio 03: botones personalizados en una Row
@Composable
fun ComponenteBoton() {
    Row(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF006D3B),
                contentColor = Color.White
            )
        ) {
            Text("Accept", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
        OutlinedButton(onClick = { }) {
            Text("Decline")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponenteBoton() {
    MovieCounterTheme { ComponenteBoton() }
}
