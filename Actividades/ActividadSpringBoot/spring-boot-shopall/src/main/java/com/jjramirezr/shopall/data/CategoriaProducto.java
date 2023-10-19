package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categoria_producto")
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria", nullable = false)
    private Integer id;

    @Column(name = "nombrecategoria", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Inventario> productos;
}
