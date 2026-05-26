package org.example;

import org.example.MODEL.autor;
import org.example.MODEL.libro;
import org.example.DAO.autorDAOImpl;
import org.example.DAO.LibroDAOImpl;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                autorDAOImpl autorDAO = new autorDAOImpl();
                LibroDAOImpl libroDAO = new LibroDAOImpl();

                int opcion;

                do {

                    System.out.println("===== MENU =====");
                    System.out.println("1. Insertar Autor");
                    System.out.println("2. Insertar Libro");
                    System.out.println("3. Salir");

                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {

                        case 1:

                            autor autor = new autor();

                            System.out.println("Nombre:");
                            autor.setNombre(sc.nextLine());

                            System.out.println("Apellido:");
                            autor.setApellido(sc.nextLine());

                            System.out.println("Nacionalidad:");
                            autor.setNacionalidad(sc.nextLine());

                            autorDAO.insertarautor(autor);

                            break;

                        case 2:

                            libro libro = new libro();

                            System.out.println("titulo:");
                            libro.setTitulo(sc.nextLine());

                            System.out.println("Genero:");
                            libro.setGenero(sc.nextLine());

                            System.out.println("ID Autor:");
                            libro.setAutorId(sc.nextInt());

                            libroDAO.insertarlibro(libro);

                            break;

                        case 3:

                            System.out.println("Saliendo...");
                            break;

                        default:

                            System.out.println("Opcion invalida");

                    }

                } while (opcion != 3);
            }
        }

