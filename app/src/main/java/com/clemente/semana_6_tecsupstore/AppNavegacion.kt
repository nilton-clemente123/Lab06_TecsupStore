package com.clemente.semana_6_tecsupstore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.clemente.semana_6_tecsupstore.components.AppDrawer
import com.clemente.semana_6_tecsupstore.components.TarjetaProducto
import com.clemente.semana_6_tecsupstore.model.Producto
import com.clemente.semana_6_tecsupstore.model.productos
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavegacion() {

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    val scope = rememberCoroutineScope()

    var favoritos by remember {
        mutableStateOf(listOf<Producto>())
    }

    val onToggleFavorito: (Producto) -> Unit = { producto ->
        favoritos = if (favoritos.any { it.id == producto.id }) {
            favoritos.filterNot { it.id == producto.id }
        } else {
            favoritos + producto
        }
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            AppDrawer(contadorFavoritos = favoritos.size)
        }
    ) {
        Scaffold(
            topBar = {

                TopAppBar(
                    title = {

                        Column() {
                            Text("TECSUP Store")
                            Text("Mas vendidos",
                                fontSize = 15.sp)
                        }

                    },

                    navigationIcon = {

                        IconButton(
                            onClick = {
                                scope.launch {
                                    drawerState.open()
                                }
                            }
                        ) {

                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Abrir menú" ,
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(121, 22, 140, 255),
                        titleContentColor = Color.White)
                    )

            }
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier.padding(innerPadding)
            ) {

                items(productos){
                    producto ->

                    TarjetaProducto(
                        producto = producto,
                        onToggleFavorito = onToggleFavorito
                    )
                }
            }


        }


    }


}