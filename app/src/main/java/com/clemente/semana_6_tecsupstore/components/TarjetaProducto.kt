package com.clemente.semana_6_tecsupstore.components

import com.clemente.semana_6_tecsupstore.model.Producto



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TarjetaProducto(
    producto: Producto
) {

    var menuAbierto by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .background(
                color = Color(0xFFF5EFFA),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier.background(Color(216, 194, 229, 128),
                    shape = RoundedCornerShape(16.dp)).size(80.dp),
                    contentAlignment = Alignment.Center



            ){
                Icon(
                    imageVector = Icons.Default.ShoppingBag,
                    contentDescription = "Cartera",
                    tint = Color(108, 20, 121, 255),
                    modifier = Modifier.size(50.dp)
                )
            }



            Spacer(
                modifier = Modifier.width(12.dp)
            )

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = producto.nombre,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "S/ ${producto.precio}",
                    color = Color(73, 35, 117, 255)
                )
            }


            IconButton(
                onClick = {
                    menuAbierto = true
                }
            ) {

                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Más opciones"
                )
            }
        }


        DropdownMenu(
            expanded = menuAbierto,
            onDismissRequest = {
                menuAbierto = false
            }
        ) {

            DropdownMenuItem(
                text = {
                    Text("Favoritos")
                },
                onClick = {
                    menuAbierto = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text("Compartir")
                },
                onClick = {
                    menuAbierto = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text("Reportar")
                },
                onClick = {
                    menuAbierto = false
                }
            )
        }
    }
}