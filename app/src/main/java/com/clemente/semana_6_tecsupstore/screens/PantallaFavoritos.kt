package com.clemente.semana_6_tecsupstore.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable

@Composable
fun PantallaFavoritos() {
    EstadoVacio(
        icono = Icons.Default.FavoriteBorder,
        titulo = "Aún no tienes favoritos",
        mensaje = "Marca los productos que te gusten y aparecerán aquí."
    )
}
