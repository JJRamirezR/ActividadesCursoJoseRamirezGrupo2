package com.methaphorce.modelo;

public class Pelicula {
    private int id;
    private String name;
    private boolean isAvailable;

    // Constructor de película con todos los parámetros, por si es necesario agregar el si no está disponible
    public Pelicula (int id, String name, boolean isAvailable){
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }
    //Constructor que por defecto pone la película disponible
    public Pelicula(int id ,String name) {
        this.id = id;
        this.name = name;
        this.isAvailable = true;
    }

    // Getter and Setter
    //ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Nombre
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Disponibilidad
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void printPelicula (){
        System.out.printf("%5d %20s %20s%n", id, name, (isAvailable)? "Disponible":"No Disponible" );

    }

}
