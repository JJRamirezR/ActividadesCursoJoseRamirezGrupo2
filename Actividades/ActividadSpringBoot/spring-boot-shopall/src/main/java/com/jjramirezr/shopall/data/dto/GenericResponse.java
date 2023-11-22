package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
public class GenericResponse {

    private int codigo;
    private boolean exito;
    private String mensaje;
    private List<Objects> datos; // este sirve para la retroalimentacion al usuario

    public GenericResponse(){
        this.datos = new ArrayList<>();
    }

    public  GenericResponse(int codigo, boolean exito, String mensaje){
        super();
        this.codigo = codigo;
        this.exito = exito;
        this.mensaje = mensaje;
    }
}
