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
public class Publicacion {
   private String titulo;
   private int paginas;

    public Publicacion() {
        paginas = 1;
        titulo = "Sin definir";
    }

    public Publicacion(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = validarPaginas(paginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = validarPaginas(paginas);
    }
    
    private int validarPaginas (int paginas){
        return (paginas > 0)? paginas:1;        
    }    
    
}
