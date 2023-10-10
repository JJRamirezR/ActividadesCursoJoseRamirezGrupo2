package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventario", nullable = false)
    private Integer id;
    private Integer idVendedor;
    private Integer idCategoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "unidad", nullable = false)
    private String unidad;

    @Column(name = "Stock", nullable = false)
    private int stock;

    @Column(name = "PrecioUnitario", nullable = false)
    private Double precioUnitario;
}
