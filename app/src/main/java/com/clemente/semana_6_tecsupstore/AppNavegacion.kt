package com.clemente.semana_6_tecsupstore

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.clemente.semana_6_tecsupstore.components.AppDrawer
import com.clemente.semana_6_tecsupstore.screens.PantallaCerrarSesion
import com.clemente.semana_6_tecsupstore.screens.PantallaFavoritos
import com.clemente.semana_6_tecsupstore.screens.PantallaInicio
import com.clemente.semana_6_tecsupstore.screens.PantallaMisPedidos
import com.clemente.semana_6_tecsupstore.screens.PantallaPerfil
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavegacion() {

    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val backStackEntry by navController.currentBackStackEntryAsState()
    val rutaActual = backStackEntry?.destination?.route
    val (titulo, subtitulo) = tituloPantalla(rutaActual)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            AppDrawer(
                rutaActual = rutaActual,
                onNavigate = { ruta ->
                    navController.navigate(ruta) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                    scope.launch {
                        drawerState.close()
                    }
                }
            )
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Column {
                            Text(titulo)
                            Text(subtitulo, fontSize = 15.sp)
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
                                contentDescription = "Abrir menú",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(121, 22, 140, 255),
                        titleContentColor = Color.White
                    )
                )
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = Rutas.INICIO,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(Rutas.INICIO) { PantallaInicio() }
                composable(Rutas.MIS_PEDIDOS) { PantallaMisPedidos() }
                composable(Rutas.FAVORITOS) { PantallaFavoritos() }
                composable(Rutas.PERFIL) { PantallaPerfil() }
                composable(Rutas.CERRAR_SESION) { PantallaCerrarSesion() }
            }
        }
    }
}

private fun tituloPantalla(ruta: String?): Pair<String, String> {
    return when (ruta) {
        Rutas.MIS_PEDIDOS -> "TECSUP Store" to "Mis pedidos"
        Rutas.FAVORITOS -> "TECSUP Store" to "Favoritos"
        Rutas.PERFIL -> "TECSUP Store" to "Perfil"
        Rutas.CERRAR_SESION -> "TECSUP Store" to "Cerrar sesión"
        else -> "TECSUP Store" to "Mas vendidos"
    }
}