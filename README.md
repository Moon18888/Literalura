# Literatura
## Java Challenge: Buscador de Libros - by Alfredo

![Estado del Proyecto](https://img.shields.io/badge/ESTADO-EN_DESARROLLO-green)
![Java JDK](https://img.shields.io/badge/Java_JDK-v17.0-blue)
![IDE](https://img.shields.io/badge/IDE-Intellij_IDEA-blue)
![Project](https://img.shields.io/badge/Project-Maven-blue)
![Spring_Boot](https://img.shields.io/badge/Spring_Boot-v3.3.0-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-v14.12-blue)
![GSON](https://img.shields.io/badge/Jackson-V2.16.2-blue)

![image](https://github.com/Moon18888/Literalura/assets/156857475/ce94a85f-b380-44b4-8039-af6fa6fd8a7f)


### Este proyecto permite a los usuarios buscar libros utilizando la API [Gutendex](https://gutendex.com/) y guardar los resultados en una base de datos PostgreSQL.

## Características 

- **Buscar Libro:** Permite buscar libros a través de la API de Gutendex y guarda el primer resultado encontrado en la base de datos.
- **Listar Libros:** Muestra en consola todos los libros guardados en la base de datos.
- **Listar Autores:** Imprime en consola todos los autores almacenados en la base de datos.
- **Listar Autores por Año:** Muestra en consola los autores que estaban vivos en el año especificado.
- **Listar Libros por Idioma:** Filtra y muestra los libros por idioma en consola.

## Requisitos 

Para este proyecto se utilizan las siguientes tecnologías:
- **Java JDK:** versión 17 o superior. Descarga en [Download the Latest Java LTS Free](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven:** versión 4 o superior, para la gestión de dependencias y construcción del proyecto.
- **Spring Boot:** versión 3.3.0, configurado a través de [Spring Initializr](https://start.spring.io/)
- **PostgreSQL:** versión 14.12 o superior, como base de datos relacional.
- **IDE:** IntelliJ IDEA, disponible en [JetBrains](https://www.jetbrains.com/es-es/idea/download/), para el desarrollo del proyecto.

## Dependencias para agregar al crear el proyecto en Spring Initializr:
- **Spring Data JPA:** para la integración con la capa de persistencia.
- **Postgres Driver:** para la conexión con la base de datos PostgreSQL.
- **Jackson:** para el manejo de JSON.
