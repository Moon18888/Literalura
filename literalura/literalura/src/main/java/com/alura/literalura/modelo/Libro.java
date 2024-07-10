package com.alura.literalura.modelo;

import jakarta.persistence.*;



@Entity
@Table(name ="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String titulo;
    @ManyToOne
    private Autor autor;
    @Enumerated(EnumType.STRING)
    private CategoriaIdioma idioma;
    private Integer descargas;

    public Libro (){}

    public Libro  (DatosLibro datosLibro){
        this.titulo = datosLibro.titulo();
        this.autor = new Autor(datosLibro.autores().get(0));
        this.descargas = datosLibro.descargas();
        this.idioma = CategoriaIdioma.fromString(datosLibro.idiomas().toString().split(",")[0].trim());

    }

    @Override
    public String toString() {
        return "-----LIBRO-----\n"+
                "Título: " + titulo + "\n" +
                "Autor: " + autor.getNombre()+ "\n" +
                "Idioma: " + idioma + "\n" +
                "Número de descargas: " + descargas + "\n" +
                "---------------";
    }
    //getters
    public Long getId() {
        return Id;
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public CategoriaIdioma getIdioma() {
        return idioma;
    }
    public Integer getDescargas() {
        return descargas;
    }

    //setters
    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setIdioma(CategoriaIdioma idioma) {
        this.idioma = idioma;
    }
}
