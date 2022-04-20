/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clase14.dominio;

/**
 *
 * @author Fabricio
 */
public class Libro extends Publicacion {

    //atributos
    private String isbn;
    //private String titulo;
    private String autor;
    //private int paginas;

    //metodo constructores inicializadores
    public Libro() {
        super();
        isbn = "....";
        //titulo = "....";
        autor = "....";
        //paginas = 0;       
    }

    public Libro(String isbn, String titulo, String autor, int paginas) {
        super(titulo, paginas);
        this.isbn = isbn;
        //this.titulo = titulo;
        this.autor = autor;
        //this.paginas = validarPaginas(paginas);
    }

    //accesores getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

//    public String getTitulo(){
//        return titulo;
//    }
//    public void setTitulo(String titulo){
//        this.titulo = titulo;
//    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

//    public int getPaginas() {
//        return paginas;
//    }
//
//    public void setPaginas(int paginas) {
//        this.paginas = validarPaginas(paginas);
//    }
    //metodos propios
    @Override
    public String toString() {
        String aux = "El libro '" + getTitulo() + "' cuyo autor es '" + autor
                + "' identificado con el isbn '" + isbn + "' tiene '" + getPaginas()
                + "' paginas.";
        return aux;
    }

//    private int validarPaginas (int paginas){
//        return (paginas > 0)? paginas:1;        
//    }   
}
