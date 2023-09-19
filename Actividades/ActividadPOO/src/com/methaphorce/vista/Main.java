package com.methaphorce.vista;

import com.methaphorce.modelo.GestorPelicula;
import com.methaphorce.modelo.Pelicula;

public class Main {

    public static void main(String[] args) {
        Pelicula prueba = new Pelicula(1, "Duro de Matar");
        Pelicula pruebaFalse = new Pelicula(2,"Rapido y Furioso", false);
        System.out.println(prueba);
        System.out.println(pruebaFalse);


        GestorPelicula pruebaGestor = new GestorPelicula();
        pruebaGestor.agregarPelicula("Duro de matar");
        pruebaGestor.agregarPelicula("Rapidos y Furiosos");
        pruebaGestor.agregarPelicula("Le era del hielo", false);
        pruebaGestor.agregarPelicula("Rambo");
        pruebaGestor.printIndex();
        System.out.println(pruebaGestor);
        pruebaGestor.eliminarPelicula(4);
        pruebaGestor.eliminarPelicula(5);
        pruebaGestor.eliminarPelicula(-1);
        pruebaGestor.eliminarPelicula(0);
        System.out.println(pruebaGestor);
        pruebaGestor.eliminarPelicula(1);
        System.out.println(pruebaGestor);
    }
}