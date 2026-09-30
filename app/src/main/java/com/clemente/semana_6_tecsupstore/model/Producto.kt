package com.clemente.semana_6_tecsupstore.model

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: Double,

)

val productos = listOf(
    Producto(1, "Audífonos", 500.50),
    Producto(2, "Mouse", 50.50),
    Producto(3, "Teclado", 20.50)
)