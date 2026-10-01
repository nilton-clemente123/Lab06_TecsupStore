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
import androidx.compose.material.icons.filled.RadioButtonUnchecked
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.Badge
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppDrawer(contadorFavoritos: Int) {

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
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(
                            color = Color(0xFFD1BBE1),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "NC",
                        color = Color(88, 7, 129, 255),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(
                    modifier = Modifier.width(15.dp)
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
                },

                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = Color(0xFFD1BBE1),
                    selectedIconColor = Color(0xFF580781),
                    selectedTextColor = Color(0xFF580781)
                )
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
                },
                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = Color(0x80D1BBE1),
                    selectedIconColor = Color(0xFF580781),
                    selectedTextColor = Color(0xFF580781)
                )
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
                },
                badge = {
                    if (contadorFavoritos > 0) {
                        Badge(
                            containerColor = Color(0xFF580781),
                            contentColor = Color.White
                        ) {
                            Text("$contadorFavoritos")
                        }
                    }
                },
                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = Color(0x80D1BBE1),
                    selectedIconColor = Color(0xFF580781),
                    selectedTextColor = Color(0xFF580781)
                )
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
                },
                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = Color(0x80D1BBE1),
                    selectedIconColor = Color(0xFF580781),
                    selectedTextColor = Color(0xFF580781)
                )
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