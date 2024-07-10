# Literatura
## Java Challenge: Buscador de Libros - by Alfredo

![Estado del Proyecto](https://img.shields.io/badge/ESTADO-EN_DESARROLLO-green)
![Java JDK](https://img.shields.io/badge/Java_JDK-v17.0-blue)
![IDE](https://img.shields.io/badge/IDE-Intellij_IDEA-blue)
![Project](https://img.shields.io/badge/Project-Maven-blue)
![Spring_Boot](https://img.shields.io/badge/Spring_Boot-v3.3.0-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-v14.12-blue)
![GSON](https://img.shields.io/badge/Jackson-V2.16.2-blue)

![Libros][(https://images.unsplash.com/photo-1512820790803-83ca734da794)](https://www.bing.com/images/search?view=detailV2&ccid=P3yluKfL&id=41EB8DDB5462A23D976A70FF43632D3A153C6417&thid=OIP.P3yluKfLBLVeKxdOV8pFQQHaEt&mediaurl=https%3a%2f%2fmedia.istockphoto.com%2fphotos%2fshelves-full-of-books-library-background-picture-id539686078%3fk%3d6%26m%3d539686078%26s%3d170667a%26w%3d0%26h%3dQt1S74L6zZW1-OBz9R1vdDzP8juL8Igl1G0q3U-icEo%3d&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.3f7ca5b8a7cb04b55e2b174e57ca4541%3frik%3dF2Q8FTotY0P%252fcA%26pid%3dImgRaw%26r%3d0%26sres%3d1%26sresct%3d1%26srh%3d799%26srw%3d1259&exph=331&expw=521&q=librero+lleno+de+libros&simid=608052887574815577&FORM=IRPRST&ck=18CE4FA33D441BF8A9ACD75047459146&selectedIndex=17&itb=0)

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
