# PROMPTS.md

Prompts utilizados para guiar el desarrollo de funcionalidades en el proyecto
**Lab06_TecsupStore** (Android + Jetpack Compose).

---

## 1. Contador de favoritos con badge en el drawer

### Prompt (texto)

> Haz que al marcar un producto como "Favoritos" desde el `DropdownMenu` de
> `TarjetaProducto.kt` se actualice un contador visible como badge en el ítem
> "Favoritos" del drawer en `AppDrawer.kt`; hoy la opción no hace nada y el ítem
> solo muestra texto, así que tú decides la forma de compartir el estado
> (ViewModel o estado elevado) y conectas ambas partes usando `Badge`, sin
> mostrarlo cuando no haya favoritos.

---

## 2. "Agregar/Eliminar de favoritos" en el menú del producto

### Prompt (texto)

> Mejora la experiencia de favoritos: actualmente el badge del ítem "Favoritos"
> del drawer solo muestra un contador, pero no permite saber qué productos están
> marcados. Cambia la opción "Favoritos" del `DropdownMenu` de cada tarjeta
> (`TarjetaProducto.kt`) para que muestre "Agregar a favoritos" cuando el producto
> no esté en favoritos, y "Eliminar de favoritos" cuando ya lo esté.

