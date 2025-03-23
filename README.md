# Aplicación de Mascotas - ListViews y Adapters

## Descripción del Proyecto
Este proyecto es una aplicación Android diseñada para mejorar la navegabilidad entre distintas categorías utilizando `ListView` y `Adapters`. Su principal objetivo es ofrecer una estructura clara y funcional para gestionar información sobre **mascotas, servicios y tiendas** relacionadas con el cuidado animal.

## Objetivo
El desarrollo de esta aplicación busca fortalecer la comprensión y aplicación de los componentes fundamentales de Android relacionados con la gestión de listas y la navegación entre actividades. Se implementaron `ListView`, `Adapters` personalizados y `Intents` para asegurar una experiencia de usuario fluida.

## Estructura del Proyecto
El proyecto se compone de las siguientes actividades y adaptadores:

### 1. `TopLevelActivity` (Pantalla Principal)
- Contiene un `ListView` con tres categorías principales:
  - **Mascotas**
  - **Servicios**
  - **Tiendas**
- Al seleccionar una categoría, se abre la actividad correspondiente mediante un `Intent`.

### 2. `MascotaCategoryActivity` (Lista de Mascotas)
- Implementa un `ListView` con nombres de distintas mascotas.
- Se utiliza un `Adapter` personalizado (`MascotaAdapter`) para mostrar imágenes y descripciones.
- Al seleccionar un elemento, se navega a `DetalleMascotaActivity` para ver más detalles.

### 3. `ServiciosCategoryActivity` (Lista de Servicios)
- Contiene un `ListView` con diferentes servicios para mascotas (veterinarias, paseadores, guarderías).
- Se emplea un `ArrayAdapter` estándar para manejar la lista.
- Se configuró la navegación a `DetalleServicioActivity` para mostrar información más detallada.

### 4. `TiendasCategoryActivity` (Lista de Tiendas)
- Presenta un `ListView` con tiendas especializadas en productos para mascotas.
- Se implementó la navegación a `DetalleTiendaActivity` para ver información sobre cada tienda.

### 5. Adaptadores Personalizados
- **`MascotaAdapter`**: Maneja la visualización de imágenes, nombres y descripciones de mascotas dentro de la lista.
- **`CategoriaAdapter`**: Se usa en las listas de Servicios y Tiendas para manejar la presentación de los elementos.

## Funcionalidad General
1. **Inicio en `TopLevelActivity`**: El usuario selecciona una categoría.
2. **Navegación a la actividad correspondiente** (`MascotaCategoryActivity`, `ServiciosCategoryActivity` o `TiendasCategoryActivity`).
3. **Selección de un elemento dentro de la lista**, lo que lleva a la actividad de detalles específica.
4. **Visualización de información detallada** en `DetalleMascotaActivity`, `DetalleServicioActivity` o `DetalleTiendaActivity`.

## Conclusión
Este proyecto permitió reforzar conocimientos clave en el desarrollo de aplicaciones Android, como la gestión de `ListView`, el uso de `Adapters` personalizados y la navegación entre actividades. Se logró una aplicación funcional que facilita la exploración de información sobre mascotas, servicios y tiendas mediante una interfaz intuitiva y bien estructurada.

