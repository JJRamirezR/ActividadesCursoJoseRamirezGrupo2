package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventario", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idVendedor",nullable = false)
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private CategoriaProducto categoria;

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

    @OneToMany(mappedBy = "inventario")
    private List<Comentario> comentarios;
}
