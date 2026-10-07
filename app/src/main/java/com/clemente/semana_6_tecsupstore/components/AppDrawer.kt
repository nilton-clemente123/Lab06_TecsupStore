package com.clemente.semana_6_tecsupstore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clemente.semana_6_tecsupstore.Rutas

private data class OpcionDrawer(
    val titulo: String,
    val icono: ImageVector,
    val ruta: String
)

@Composable
fun AppDrawer(
    rutaActual: String?,
    onNavigate: (String) -> Unit
) {
    val opciones = listOf(
        OpcionDrawer("Inicio", Icons.Default.Home, Rutas.INICIO),
        OpcionDrawer("Mis pedidos", Icons.Default.ShoppingBag, Rutas.MIS_PEDIDOS),
        OpcionDrawer("Favoritos", Icons.Default.FavoriteBorder, Rutas.FAVORITOS),
        OpcionDrawer("Perfil", Icons.Default.AccountCircle, Rutas.PERFIL),
        OpcionDrawer("Cerrar sesión", Icons.AutoMirrored.Filled.Logout, Rutas.CERRAR_SESION),
    )

    ModalDrawerSheet {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(color = Color(0xFFD1BBE1), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "NC",
                        color = Color(88, 7, 129, 255),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.width(15.dp))

                Column {
                    Text(
                        text = "Clemente",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "nilton.clemente@tecsup.edu.pe",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(12.dp))

            opciones.forEach { opcion ->
                NavigationDrawerItem(
                    label = { Text(opcion.titulo) },
                    selected = rutaActual == opcion.ruta,
                    onClick = { onNavigate(opcion.ruta) },
                    icon = {
                        Icon(
                            imageVector = opcion.icono,
                            contentDescription = opcion.titulo
                        )
                    },
                    colors = NavigationDrawerItemDefaults.colors(
                        selectedContainerColor = Color(0xFFD1BBE1),
                        selectedIconColor = Color(0xFF580781),
                        selectedTextColor = Color(0xFF580781)
                    )
                )
            }
        }
    }
}