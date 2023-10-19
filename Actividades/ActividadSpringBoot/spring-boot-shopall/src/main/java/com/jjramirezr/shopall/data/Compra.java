package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "OrdenDetalle")
public class OrdenDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrden", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idOrdenTotal",nullable = false)
    private OrdenTotal ordenTotal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "idInventario",nullable = false)
    private Inventario producto; //Debería de ser inventario, pero opte por un nombre más representativo

    @Column(name = "Cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "Precio", nullable = false)
    private Double precio;


}
