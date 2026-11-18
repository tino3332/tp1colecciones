package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creación del ArrayList de tipo Alumno (respeta orden y permite duplicados)
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Almacenar varios alumnos en el ArrayList (incluyendo un duplicado)
        listaAlumnos.add(new Alumno("Agustín Mocayar", 9.5));
        listaAlumnos.add(new Alumno("Lucía Pérez", 8.0));
        listaAlumnos.add(new Alumno("Carlos Gómez", 7.25));
        listaAlumnos.add(new Alumno("Lucía Pérez", 8.0)); // Duplicado permitido por List

        System.out.println("==========================================");
        System.out.println("   LISTA DE ALUMNOS - PROGRAMACIÓN III    ");
        System.out.println("==========================================");

        // Recorrer la lista con un bucle for-each e imprimir cada objeto
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno); // Invoca implícitamente al toString() sobrescrito
        }

        System.out.println("==========================================");
    }
}