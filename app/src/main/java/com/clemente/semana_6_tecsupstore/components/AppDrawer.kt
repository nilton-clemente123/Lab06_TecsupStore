package com.clemente.semana_6_tecsupstore.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.RadioButtonUnchecked
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppDrawer() {

    var opcionSeleccionada by remember {
        mutableStateOf("Mis pedidos")
    }

    ModalDrawerSheet {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Row() {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Usuario",
                    modifier = Modifier.padding(16.dp)

                )

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Column() {
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






            Spacer(
                modifier = Modifier.height(16.dp)
            )

            HorizontalDivider()

            Spacer(
                modifier = Modifier.height(12.dp)
            )


            NavigationDrawerItem(
                label = {
                    Text("Inicio")
                },
                selected = opcionSeleccionada == "Inicio",
                onClick = {
                    opcionSeleccionada = "Inicio"
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.RadioButtonUnchecked,
                        contentDescription = "Inicio"
                    )
                }
            )


            NavigationDrawerItem(
                label = {
                    Text("Mis pedidos")
                },
                selected = opcionSeleccionada == "Mis pedidos",
                onClick = {
                    opcionSeleccionada = "Mis pedidos"
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.RadioButtonUnchecked,
                        contentDescription = "Mis pedidos"
                    )
                }
            )


            NavigationDrawerItem(
                label = {
                    Text("Favoritos")
                },
                selected = opcionSeleccionada == "Favoritos",
                onClick = {
                    opcionSeleccionada = "Favoritos"
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.RadioButtonUnchecked,
                        contentDescription = "Favoritos"
                    )
                }
            )


            NavigationDrawerItem(
                label = {
                    Text("Perfil")
                },
                selected = opcionSeleccionada == "Perfil",
                onClick = {
                    opcionSeleccionada = "Perfil"
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.RadioButtonUnchecked,
                        contentDescription = "Perfil"
                    )
                }
            )


            NavigationDrawerItem(
                label = {
                    Text("Cerrar sesión")
                },
                selected = false,
                onClick = {
                    opcionSeleccionada = ""
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.RadioButtonUnchecked,
                        contentDescription = "Cerrar sesión"
                    )
                }
            )
        }
    }
}