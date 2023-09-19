package com.methaphorce.modelo;
import com.methaphorce.modelo.Pelicula;
import java.util.ArrayList;

public class GestorPelicula {
    // ArrayList<String> cars = new ArrayList<String>();
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
    }
    //Agregar pelicula que no esta disponible
    public void agregarPelicula (String name, boolean isAvailable){
        if(gestorPelicula.size()< 1){
            gestorPelicula.add(new Pelicula(1,name,isAvailable));
        } else {
            int id = gestorPelicula.size() + 1;
            gestorPelicula.add(new Pelicula(id, name,isAvailable));
        }
    }

    public void eliminarPelicula (int id){
        int size = gestorPelicula.size();
        if (size > 0 || (size-1) <id){
            gestorPelicula.remove(id-1);
        } else {
            System.out.println("Indice no encontrado, no es posible realizar la acción");
        }
    }

    //Métodos para realizar algunos pruebas
    public void printIndex(){
        System.out.println("El indice es " + gestorPelicula.isEmpty());
        System.out.println("El tamño del arreglo es " + gestorPelicula.size());
        System.out.println("El primer elemento es " + gestorPelicula.get(0));
        System.out.println("El último elemento es " + gestorPelicula.get(gestorPelicula.size()-1));
    }
    @Override
    public String toString() {
        return "GestorPelicula{" +
                "gestorPelicula=" + gestorPelicula +
                '}';
    }
}
