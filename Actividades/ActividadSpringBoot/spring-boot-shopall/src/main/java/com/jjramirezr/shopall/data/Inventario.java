package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinventario", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idvendedor",nullable = false)
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private CategoriaProducto categoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "unidad", nullable = false)
    private String unidad;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "preciounitario", nullable = false)
    private Double precioUnitario;

    @OneToMany(mappedBy = "producto")
    private List<Compra> productos;

    @OneToMany(mappedBy = "inventario")
    private List<Comentario> comentarios;

    //Constructor para añadir producto


    public Inventario(Vendedor vendedor, CategoriaProducto categoria,
                      String nombre, String descripcion, String unidad,
                      int stock, Double precioUnitario) {
        this.vendedor = vendedor;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }
}
