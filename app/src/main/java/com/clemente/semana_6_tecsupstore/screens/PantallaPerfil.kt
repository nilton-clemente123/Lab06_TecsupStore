package com.clemente.semana_6_tecsupstore.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color(0xFFD1BBE1), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "NC",
                color = Color(88, 7, 129, 255),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Clemente",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = Color(73, 35, 117, 255)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "nilton.clemente@tecsup.edu.pe",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        HorizontalDivider()

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Información de la cuenta",
            style = MaterialTheme.typography.titleMedium,
            color = Color(73, 35, 117, 255)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Estudiante de TECSUP",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
    }
}
