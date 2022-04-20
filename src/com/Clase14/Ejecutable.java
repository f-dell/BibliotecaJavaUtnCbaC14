/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clase14;

import com.Clase14.dominio.Biblioteca;
import com.Clase14.dominio.Libro;
import com.Clase14.dominio.Revista;
import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        
        int cantidad;
        
        do {
            System.out.println("Ingrese la cantidad de publicaciones de la biblioteca(>0): ");
            cantidad = input.nextInt();
        } while (cantidad <= 0);
        
        Biblioteca miBiblioteca = new Biblioteca(4);

        Libro libro1, libro2;
        Revista revista1;
        
        revista1 = new Revista(33, "A todo motor", 60);

        libro1 = new Libro();
        libro1.setIsbn("123-456-789");
        libro1.setTitulo("La Iliada");
        libro1.setAutor("Homero");
        libro1.setPaginas(500);

        String isbn, titulo, autor;
        int paginas;

        System.out.println("Ingrese el isbn del libro: ");
        isbn = inputString.nextLine();

        System.out.println("Ingrese el titulo del libro: ");
        titulo = inputString.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        autor = inputString.nextLine();

        System.out.println("Ingrese el numero de paginas del libro: ");
        paginas = input.nextInt();

        libro2 = new Libro(isbn, titulo, autor, paginas);

//        System.out.println("Libro 1: " + libro1.toString());
//        System.out.println("Libro 2: " + libro2.toString());
//        if (libro1.getPaginas() > libro2.getPaginas()) {
//            System.out.println("El libro 1 tiene mayor cantidad de paginas ("
//                    + libro1.getPaginas() + ")");
//        } else if (libro1.getPaginas() < libro2.getPaginas()) {
//            System.out.println("El libro 2 tiene mayor cantidad de paginas ("
//                    + libro2.getPaginas() + ")");
//        }else{
//            System.out.println("Ambos libros tienen la misma cantidad de paginas ("
//            + libro1.getPaginas() + ")");
//        }
        if (miBiblioteca.agregarPublicacion(libro1) == true) {
            System.out.println("Libro agregado");
        } else {
            System.out.println("No se pudo agregar el libro");
        }

        miBiblioteca.agregarPublicacion(libro2);
        
        miBiblioteca.agregarPublicacion(revista1);
        
        
        String listado = miBiblioteca.mostrarListado();
        System.out.println(listado);
        
        String unTitulo = miBiblioteca.buscarPublicacion("La Odisea");
        System.out.println(unTitulo);
        
        int nPaginas = miBiblioteca.contarLibros(552);
        System.out.println(nPaginas);

    }
}
