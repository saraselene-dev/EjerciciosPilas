# Ejercicios de Pilas Objetuales — Estructura de Datos

## Descripción

Este repositorio contiene tres ejercicios prácticos desarrollados con **pilas objetuales (Stack)** en Java, 
cada uno simulando un sistema del mundo real que gestiona información mediante la lógica LIFO (*Last In, First Out*).

## Objetivo general

- Aplicar el uso de pilas con objetos en lugar de tipos primitivos.
- Practicar las operaciones fundamentales de una pila: `push()`, `pop()` y `peek()`.
- Comprender cómo distintos sistemas cotidianos (edición de texto, control de versiones, catalogación de libros) pueden modelarse
- mediante estructuras de tipo LIFO.

## Estructura del repositorio

Cada carpeta contiene un ejercicio independiente con su propia clase objetual, su clase de métodos y su menú de consola.

## 1. Gestión de Libros en una Biblioteca

Simula el registro y control de libros en una biblioteca mediante una pila.

**Objeto `ObjLibro`:** `isbn`, `titulo`, `autor`, `anioPublicacion`.

**Funcionalidades:**
- Registrar un libro (`push`).
- Retirar el último libro registrado (`pop`).
- Consultar el último libro registrado (`peek`).
- Mostrar todos los libros almacenados.
- Eliminar un libro específico por ISBN.

## 2. Sistema de Deshacer en un Editor de Texto

Simula la función "deshacer" de un editor de texto, registrando cada cambio realizado.

**Objeto `ObjCambioTexto`:** `usuario`, `textoAnterior`, `textoNuevo`, `fecha` (generada automáticamente).

**Funcionalidades:**
- Registrar cada cambio realizado (`push`).
- Deshacer el último cambio (`pop`).
- Consultar el último cambio realizado (`peek`).
- Mostrar el historial completo de cambios.

## 3. Sistema de Versiones de un Archivo

Simula el control de versiones de un archivo, permitiendo crear y retroceder entre versiones.

**Objeto `ObjArchivos`:** `numeroVersion` (contador incremental), `nombreArchivo`, `fecha` (generada automáticamente), `descripcion`.

**Funcionalidades:**

- Crear una nueva versión y guardarla en la pila (`push`).
- Volver a la versión anterior (`pop`).
- Consultar la versión actual (`peek`).
- Mostrar todas las versiones disponibles.


## Flujo de trabajo (Git)

El desarrollo se organizó mediante una rama por ejercicio, integrada posteriormente a `Develop` mediante Pull Requests:

## Autor

SaraSelene-Dev
