package com.clemente.semana_6_tecsupstore.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.runtime.Composable

@Composable
fun PantallaCerrarSesion() {
    EstadoVacio(
        icono = Icons.AutoMirrored.Filled.Logout,
        titulo = "Cerrar sesión",
        mensaje = "Tu sesión ha finalizado. ¡Gracias por usar TECSUP Store!"
    )
}
