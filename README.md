# 📱 Tarea 1 — Elementos Básicos de Interfaz de Usuario en Android

## Descripción de la Aplicación

Aplicación Android educativa que demuestra los **elementos fundamentales de interfaz de usuario (UI)** disponibles en el desarrollo Android. La app está organizada en **5 fragments** dentro de una actividad principal (`MainActivity`), cada uno dedicado a una categoría de componentes UI con ejemplos interactivos y explicaciones.

### Capturas de la Aplicación

<details>
<summary><strong>📸 Ver capturas </strong></summary>

</details>

### Fragments

| #   | Fragment                      | Contenido                                                                                                         |
| --- | ----------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| 1   | **TextFieldsFragment**        | Campos de texto con `EditText` estilizados (nombre, email, teléfono, contraseña, número, comentarios multi-línea) |
| 2   | **ButtonsFragment**           | Botones de acción: `Button`, `ImageButton`, `FloatingActionButton`                                                |
| 3   | **SelectionElementsFragment** | Controles de selección: `Chip`, `CheckBox`, `RadioButton`, `ToggleButton`, `Switch`                               |
| 4   | **ListsFragment**             | Listas dinámicas con `RecyclerView` y posibilidad de agregar elementos                                            |
| 5   | **InformationFragment**       | Elementos informativos: `TextView`, `ImageView`, `ProgressBar` con simulación de descarga                         |

### Navegación

- **TabLayout** con íconos en la parte superior permite cambiar entre los 5 fragments
- **ViewPager2** permite deslizar horizontalmente entre fragments

### Funcionalidades Interactivas

**Fragment 1 — Campos de Texto:**

- 6 tipos de campos de entrada con `EditText` estilizados con fondo personalizado
- Botón "Mostrar datos ingresados" que valida y muestra los datos en pantalla

**Fragment 2 — Botones:**

- `Button` normal que muestra un Toast al presionar
- `ImageButton` con ícono personalizado
- `FloatingActionButton` (FAB) con ícono

**Fragment 3 — Elementos de Selección:**

- `Chips` con selección múltiple + verificación
- `CheckBox` con 3 opciones + verificación
- `RadioButton` con selección exclusiva + verificación
- `ToggleButton` que cambia el color de fondo
- `Switch (Material)` para Wifi/Bluetooth

**Fragment 4 — Listas:**

- `EditText` para agregar elementos dinámicamente
- `RecyclerView` con items numerados y diseño tipo tarjeta

**Fragment 5 — Elementos de Información:**

- `ImageView` mostrando una imagen
- `ProgressBar` horizontal con simulación de descarga animada
- `TextView` mostrando el progreso de la descarga en texto

## Instrucciones de Uso

### Requisitos previos

- Android Studio (versión reciente)
- JDK 11 o superior

### Cómo probar

1. **Navegar** entre los 5 tabs deslizando o tocando las pestañas superiores
2. **Interactuar** con los elementos de cada fragment (escribir texto, presionar botones, seleccionar opciones)
3. **Campos de texto:** Escribe datos en los campos y presiona "Mostrar datos ingresados" para ver un resumen
4. **Listas:** Agrega elementos escribiendo texto y presionando el botón "Agregar a lista"
5. **Descarga simulada:** En el tab de Elementos de Información, presiona "Simular Descarga" para ver la barra de progreso animada

## Instalación

1. Clonar o descargar el repositorio
2. Abrir el proyecto en Android Studio
3. Esperar a que Gradle sincronice las dependencias
4. Conectar un dispositivo Android o iniciar un emulador (API 24+)
5. Presionar **Run ▶️**
