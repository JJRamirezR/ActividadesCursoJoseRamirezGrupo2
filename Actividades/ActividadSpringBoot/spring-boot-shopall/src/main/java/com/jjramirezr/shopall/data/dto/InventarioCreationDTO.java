package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventarioCreationDTO {
    private int categoria;
    private String nombre;
    private String descripcion;
    private String unidad;
    private int stock;
    private double precioUnitario;
}
