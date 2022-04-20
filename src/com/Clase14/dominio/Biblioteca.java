/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clase14.dominio;

import java.util.Arrays;

/**
 *
 * @author Fabricio
 */
public class Biblioteca {

    //atributos
    private final Publicacion[] estanteria;
    private int ultimo;

    //metodos constructores inicializadores
    public Biblioteca() {
        estanteria = new Publicacion[20];
        ultimo = 0;
    }

    public Biblioteca(int cantidad) {
        estanteria = new Publicacion[cantidad];
    }

    public Publicacion[] getEstanteria() {
        return estanteria;
    }

    public boolean agregarPublicacion(Publicacion unaPublicacion) {
        boolean aux = false;
//        for (int i = 0; i < estanteria.length; i++) {
//            if (estanteria[i] == null) {
//                estanteria[i] = unaPublicacion;
//                aux = true;
//                break;
//            }
//        }
        if (ultimo < estanteria.length) {
            estanteria[ultimo] = unaPublicacion;
            aux = true;
            ultimo++;
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
    
    public String buscarPublicacion (String unTitulo) {
        String aux = "Publicacion no encontrada";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                if(estanteria[i].getTitulo().equals(unTitulo)) {
                    aux = Arrays.toString(estanteria);
                    break;
                }
            }
        }
        return aux;
    }
    
    public int contarLibros(int nPaginas) {
        int aux = 0;
            for (int i = 0; i < estanteria.length; i++) {
                if (estanteria[i] != null) {
                    if (estanteria[i] instanceof Libro && 
                            estanteria[i].getPaginas() >= nPaginas){
                        aux ++;
                    }
                }
        }
        return aux;
    }

}
