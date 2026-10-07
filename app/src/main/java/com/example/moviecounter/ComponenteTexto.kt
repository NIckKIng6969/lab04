package com.example.moviecounter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviecounter.ui.theme.MovieCounterTheme

// Componente del laboratorio 03: Text dentro de una Column
@Composable
fun ComponenteTexto() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Bienvenido al curso!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Texto de ejemplo con Column",
            fontSize = 18.sp,
            color = Color(0xFF006D3B)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponenteTexto() {
    MovieCounterTheme { ComponenteTexto() }
}
