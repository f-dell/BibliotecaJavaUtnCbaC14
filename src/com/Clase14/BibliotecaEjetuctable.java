/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clase14;

import com.Clase14.dominio.Biblioteca;
import com.Clase14.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class BibliotecaEjetuctable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Biblioteca miBiblioteca = new Biblioteca(2);

        /*Libro libro1, libro2;

        libro1 = new Libro();
        libro1.setIsbn("123-456-789");
        libro1.setTitulo("La Iliada");
        libro1.setAutor("Homero");
        libro1.setPaginas(500);
         */
        int cantidad;

        do {
            System.out.println("Ingrese la cantidad de libros de la biblioteca(>0): ");
            cantidad = input.nextInt();
        } while (cantidad <= 0);
        
        //creamos un arreglo que represente lo fisicamente seria el estante
        
        String isbn, titulo, autor;
        int paginas;
        
        Libro estanteria[] = new Libro[cantidad];
        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Ingrese el isbn del libro: ");
        isbn = inputString.nextLine();

        System.out.println("Ingrese el titulo del libro: ");
        titulo = inputString.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        autor = inputString.nextLine();

        System.out.println("Ingrese el numero de paginas del libro: ");
        paginas = input.nextInt();
        
        estanteria[i] = new Libro(isbn, titulo, autor, paginas);
        
        }
        
        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Libro " +": "  + estanteria[i].toString());
            
        }       

    }

}
