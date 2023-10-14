package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComentario", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idCliente",nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idInventario",nullable = false)
    private Inventario inventario;

    @Column(name = "Comentario", nullable = false)
    private String comentario;

    @Column(name = "Fecha")
    private Timestamp fecha;
}
