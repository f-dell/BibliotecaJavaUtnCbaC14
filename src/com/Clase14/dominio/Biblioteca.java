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
public class Biblioteca {

    //atributos
    private final Libro[] estanteria;
    private int ultimoLibro;

    //metodos constructores inicializadores
    public Biblioteca() {
        estanteria = new Libro[20];
        ultimoLibro = 0;
    }

    public Biblioteca(int cantidad) {
        estanteria = new Libro[cantidad];
    }

    public Libro[] getEstanteria() {
        return estanteria;
    }

    public boolean agregarLibro(Libro unLibro) {
        boolean aux = false;
//        for (int i = 0; i < estanteria.length; i++) {
//            if (estanteria[i] == null) {
//                estanteria[i] = unLibro;
//                aux = true;
//                break;
//            }
//        }
        if (ultimoLibro < estanteria.length) {
            estanteria[ultimoLibro] = unLibro;
            aux = true;
            ultimoLibro++;
        }
        return aux;
    }

    public String mostrarListado() {
        String aux = "Estanteria:\n[";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                aux = aux + estanteria[i].getTitulo() + "\t|";
            } else {
                aux = aux + "Lugar vacio\t|";
            }
        }
        aux += "]";
        return aux;
    }

}
