package com.methaphorce.vista;

import com.methaphorce.modelo.GestorPelicula;
import com.methaphorce.modelo.Pelicula;

public class Main {

    public static void main(String[] args) {
        //Creando una instancia de Gestor de película
        GestorPelicula pruebaGestor = new GestorPelicula();

        //Agregando películas
        pruebaGestor.agregarPelicula("Duro de matar");
        pruebaGestor.agregarPelicula("Rapidos y Furiosos");
        pruebaGestor.agregarPelicula("Le era del hielo", false);
        pruebaGestor.agregarPelicula("Rambo");

        // Imprimiendo películas
        pruebaGestor.printListaPeliculas();
        pruebaGestor.mostrarDisponibles();
        pruebaGestor.mostrarNoDisponibles();

        //ELIMINANDO PELICULA
        pruebaGestor.eliminarPelicula(1); // SE ELIMINA PELICULA CON ID = 1

        //SET DE NUEVOS ESTADOS DE DISPONIBILIDAD
        pruebaGestor.setPeliculaDisponible(1);
        pruebaGestor.setPeliculaNoDisponible(2);
        pruebaGestor.printListaPeliculas();

    }
}