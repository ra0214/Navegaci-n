# Rick & Morty App 

Una aplicación de Android moderna construida con **Jetpack Compose** y **Clean Architecture** que consume la API de Rick & Morty. Este proyecto demuestra el uso de inyección de dependencias manual, flujos de datos unidireccionales (UDF) y modularización por capas.



## 🚀 Características
* **Listado de Personajes:** Carga asíncrona de datos desde una API REST.
* **Diseño Adaptativo:** Uso de Material 3, Cards personalizadas y respeto al SafeArea.
* **Estados de UI:** Manejo robusto de estados (Loading, Error, Empty States).
* **UX Fluida:** Implementación de *Pull-to-Refresh* e imágenes con caché mediante Coil.
* **Identidad Visual:** Splash Screen nativa y Adaptive Icons.

## 🏗️ Arquitectura
El proyecto sigue los principios de **Clean Architecture**, asegurando que la lógica de negocio sea independiente de la interfaz de usuario y de las fuentes de datos externas.

1.  **Presentation (UI):** Uso de ViewModels y `UiState` para un flujo de datos unidireccional.
2.  **Domain:** Contiene los Casos de Uso (`GetCharactersUseCase`) y las Entidades puras en Kotlin.
3.  **Data:** Implementación de Repositorios, Mappers para transformar DTOs a modelos de Dominio y configuración de Retrofit.

### Inyección de Dependencias
Se implementó **DI Manual** para un control total del grafo de dependencias:
* `AppContainer`: Singleton que gestiona las dependencias de red y repositorios.
* `CharactersModule`: Proveedor de instancias para la feature de personajes.



## 🛠️ Stack Tecnológico
* **Kotlin:** Lenguaje base.
* **Jetpack Compose:** Toolkit para UI declarativa.
* **Coroutines & Flow:** Gestión de concurrencia y estados reactivos.
* **Retrofit & Gson:** Consumo y parseo de APIs REST.
* **Coil:** Carga eficiente de imágenes asíncronas.
* **Architecture Components:** ViewModel, StateFlow y Lifecycle.

## 📂 Estructura del Proyecto
```text
features/rickandmorty/
├── data/           # Repositories, DTOs (Data Transfer Objects) y Mappers
├── domain/         # Entidades de negocio y Use Cases
├── di/             # Inyección de dependencias manual (Modules)
└── presentation/   # UI State, ViewModels y Composables (Screens/Components)
core/
├── di/             # AppContainer global
└── network/        # RickAndMortyApi y configuración de Retrofit
