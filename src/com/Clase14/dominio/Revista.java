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
public class Revista extends Publicacion {

    private int codigo;

    public Revista() {
        super();
        codigo = 0;
    }

    public Revista(int codigo, String titulo, int paginas) {
        super(titulo, paginas);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Revista" + super.toString();
    }   
    

}
