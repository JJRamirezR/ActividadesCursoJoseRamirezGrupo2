package com.methaphorce.modelo;

import java.util.ArrayList;

public class GestorPelicula {
    //Array list donde se almacenan las películas;
    private ArrayList<Pelicula> gestorPelicula = new ArrayList<Pelicula>();


    //Agregar pelicula que por defecto esta disponible
    public void agregarPelicula (String name){
        if(gestorPelicula.size()< 1){
            gestorPelicula.add(new Pelicula(1,name));
        } else {
            int id = gestorPelicula.size() + 1;
            gestorPelicula.add(new Pelicula(id, name));
        }
        System.out.println("Película agregada con exito");
    }
    //Agregar pelicula donde su estado inicial es no disponible
    public void agregarPelicula (String name, boolean isAvailable){
        if(gestorPelicula.size()< 1){
            gestorPelicula.add(new Pelicula(1,name,isAvailable));
        } else {
            int id = gestorPelicula.size() + 1;
            gestorPelicula.add(new Pelicula(id, name,isAvailable));
        }
        System.out.println("Película agregada con exito");
    }

    //Eliminar película
    public void eliminarPelicula (int id){
        int size = gestorPelicula.size();
        if (size > 0 && (size+1) > id && id>0){
            gestorPelicula.remove(id-1);
            System.out.println("Película Eliminada con éxito");
            //Ciclo para ajustar el id de la película a partir de la eliminación
            for (int i = id-1; i<(size-1); i++ ){
                gestorPelicula.get(i).setId(i+1);
            }
        } else {
            System.out.println("Indice no encontrado, no es posible realizar la acción");
        }
    }

    public void setPeliculaDisponible(int id){
        gestorPelicula.get(id-1).setAvailable(true);
        System.out.println("Cambio de disponibilidad: Disponible");
    }

    public void setPeliculaNoDisponible(int id){
        gestorPelicula.get(id-1).setAvailable(false);
        System.out.println("Cambio de disponibilidad: No Disponible");
    }
    // Mostrar peliculas

    public void printListaPeliculas (){
        System.out.println("-".repeat(60));
        System.out.println("LISTA DE PELICULAS COMPLETA");
        System.out.printf("%5s %20s %20s%n", "ID", "Nombre","Disponibilidad" );
        System.out.println("-".repeat(60));
        int size = gestorPelicula.size();
        for (int i = 0; i<size;i++){
            gestorPelicula.get(i).printPelicula();
        }

    }


    //Mostrar películas disponibles
    public void mostrarDisponibles(){
        int size = gestorPelicula.size();
        System.out.println("-".repeat(60));
        System.out.println("LISTA DE PELICULAS DISPONIBLES");
        System.out.println("-".repeat(60));
        for (int i = 0; i<size;i++){
            if (gestorPelicula.get(i).isAvailable()){
                gestorPelicula.get(i).printPelicula();
            }
        }
    }
    //Mostrar películas no disponibles
    public void mostrarNoDisponibles(){
        int size = gestorPelicula.size();
        System.out.println("-".repeat(60));
        System.out.println("LISTA DE PELICULAS NO DISPONIBLES");
        System.out.println("-".repeat(60));
        for (int i = 0; i<size;i++){
            if (!(gestorPelicula.get(i).isAvailable())){
                gestorPelicula.get(i).printPelicula();
            }
        }
    }


}
