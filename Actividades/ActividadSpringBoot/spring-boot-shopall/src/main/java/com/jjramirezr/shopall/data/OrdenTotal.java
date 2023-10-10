package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "OrdenTotal")
public class OrdenTotal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrdenTotal", nullable = false)
    private Integer id;

    private Integer idCliente;

    @Column(name = "totalPrecio", nullable = false)
    private Double total;

    @Column(name = "Fecha", nullable = false)
    private Timestamp fecha;

    @Column(name = "Estatus", nullable = false)
    private String estatus;

}
