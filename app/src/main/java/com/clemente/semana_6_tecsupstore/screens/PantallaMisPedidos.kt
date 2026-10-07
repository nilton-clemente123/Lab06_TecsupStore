package com.clemente.semana_6_tecsupstore.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.runtime.Composable

@Composable
fun PantallaMisPedidos() {
    EstadoVacio(
        icono = Icons.Default.ShoppingBag,
        titulo = "Aún no tienes pedidos",
        mensaje = "Los productos que compres aparecerán aquí."
    )
}
