# 📱 Tarea 1 — Elementos Básicos de Interfaz de Usuario en Android

## Descripción de la Aplicación

Aplicación Android educativa que demuestra los **elementos fundamentales de interfaz de usuario (UI)** disponibles en el desarrollo Android. La app está organizada en **5 fragments** dentro de una actividad principal (`MainActivity`), cada uno dedicado a una categoría de componentes UI con ejemplos interactivos y explicaciones.

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

**Fragment 1 — TextFields (Campos de Texto):**

- 6 tipos de campos de entrada con `EditText` estilizados con fondo personalizado
- Botón "Mostrar datos ingresados" que valida y muestra los datos en pantalla
<details>
  <summary><strong>📸 Ver capturas </strong></summary>
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/c3fc9792-4f44-44b3-8d54-0bce79f215d8" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/2170e5f4-bc61-45ec-a5a4-6dc173803a9d" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/1a37750d-5b50-4c9a-9bef-9c940c58af84" />
</details>

**Fragment 2 — Botones:**

- `Button` normal que muestra un Toast al presionar
- `ImageButton` con ícono personalizado
- `FloatingActionButton` (FAB) con ícono
<details>
  <summary><strong>📸 Ver capturas </strong></summary>
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/907e2783-c5b8-45be-8096-a9ed743e0a04" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/6689be71-c126-47d1-b0f4-2c4b915ff357" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/58529450-5ae2-4dc9-ba84-29132d056e08" />
</details>

**Fragment 3 — Elementos de Selección:**

- `Chips` con selección múltiple + verificación
- `CheckBox` con 3 opciones + verificación
- `RadioButton` con selección exclusiva + verificación
- `ToggleButton` que cambia el color de fondo
- `Switch (Material)` para Wifi/Bluetooth
<details>
  <summary><strong>📸 Ver capturas </strong></summary>
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/cb06309e-ecf2-4fb5-8436-3a9828382042" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/20d1e680-020a-4414-b5bf-4d4e93e0c04e" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/17e0c93b-3405-45c6-b48e-b8f3656aa157" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/1e1284cf-7fde-48c7-a945-6e9d7f8ba617" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/10fc11cb-5519-4ce5-97cc-a1b7e121227d" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/c0810bfd-858f-4a46-b68e-e30d45a87472" />
</details>

**Fragment 4 — Listas:**

- `EditText` para agregar elementos dinámicamente
- `RecyclerView` con items numerados y diseño tipo tarjeta
<details>
  <summary><strong>📸 Ver capturas </strong></summary>
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/072f6768-3306-402e-9c16-ac6886bdbdb6" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/8ecff0f7-bce6-496e-8a3e-8c650e748f1c" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/f0e67627-c5ac-4415-a482-98e2df6d855e" />
</details>

**Fragment 5 — Elementos de Información:**

- `ImageView` mostrando una imagen
- `ProgressBar` horizontal con simulación de descarga animada
- `TextView` mostrando el progreso de la descarga en texto
<details>
  <summary><strong>📸 Ver capturas </strong></summary>
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/cbfc9023-cf43-44fe-b377-a8a8612dece6" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/69c47bba-a74f-4fb9-b5d9-64bed02bed58" />
  <img width="270" height="600" alt="image" src="https://github.com/user-attachments/assets/8d5b957a-b676-4751-be83-2f102bdc0c94" />
</details>

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
