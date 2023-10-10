package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "OrdenTotal")
public class OrdenTotal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrdenTotal", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente",nullable = false)
    private Cliente cliente;

    @Column(name = "totalPrecio", nullable = false)
    private Double total;

    @Column(name = "Fecha", nullable = false)
    private Timestamp fecha;

    @Column(name = "Estatus", nullable = false)
    private String estatus;

    @OneToMany(mappedBy = "ordenTotal")
    private List<OrdenDetalle> items;

}
