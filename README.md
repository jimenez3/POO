# Proyecto: Sistema de Gestión de Contenidos Audiovisuales

## Introducción
Este proyecto fue desarrollado como parte del curso de Programación Orientada a Objetos (POO) en Java, con el objetivo de aplicar los principios fundamentales de la POO mediante la creación de un sistema que modela diferentes tipos de contenidos audiovisuales.  
El sistema permite gestionar películas, series de televisión, documentales, cortometrajes y videos educativos, además de establecer relaciones entre ellos y otros elementos como actores, temporadas e investigadores.

## Objetivos

### Objetivo General
Desarrollar un sistema orientado a objetos en Java que modele la gestión de contenidos audiovisuales aplicando los conceptos de herencia, encapsulamiento, composición, agregación y asociación entre clases.

### Objetivos Específicos
1. Implementar clases que representen distintos tipos de contenido audiovisual.
2. Incorporar nuevas clases relacionadas (Actor, Temporada e Investigador) y definir sus relaciones.
3. Crear subclases adicionales (Cortometraje y VideoEducativo) que amplíen la funcionalidad.
4. Implementar métodos que permitan la creación y manipulación de objetos.
5. Elaborar un diagrama de clases que refleje la estructura del sistema.
6. Verificar el correcto funcionamiento del sistema a través de pruebas en la clase `Main`.

## Descripción del Sistema
El sistema utiliza una clase principal `ContenidoAudiovisual` de la cual heredan todas las demás.  
Cada tipo de contenido (película, serie, documental, etc.) contiene sus propios atributos y métodos, y mantiene relaciones con otras clases según corresponda.

### Clases Principales
- **ContenidoAudiovisual**: clase base con atributos comunes como `titulo`, `duracionEnMinutos` y `genero`.
- **Pelicula**: hereda de ContenidoAudiovisual, incluye el atributo `estudio` y se asocia con `Actor`.
- **SerieDeTV**: hereda de ContenidoAudiovisual y se compone de `Temporada`.
- **Documental**: hereda de ContenidoAudiovisual y se relaciona con `Investigador`.
- **Cortometraje**: subclase con atributos `director` y `premiado`.
- **VideoEducativo**: subclase con atributos `tema`, `autor` y `nivelDificultad`.
- **Actor**: clase asociada con `Pelicula` o `Cortometraje`.
- **Temporada**: clase dependiente de `SerieDeTV`.
- **Investigador**: clase asociada a `Documental`.

## Relaciones Entre Clases
| Tipo de Relación | Clases Involucradas | Descripción |
|------------------|--------------------|--------------|
| Herencia | Pelicula, SerieDeTV, Documental, Cortometraje, VideoEducativo → ContenidoAudiov
