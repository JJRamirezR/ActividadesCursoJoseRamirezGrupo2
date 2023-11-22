package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="Notificacion_Vendedor")
public class NotificacionVendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnotificacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idvendedor",nullable = false)
    private Vendedor vendedor;

    @Column(name = "notificacion", nullable = false)
    private String notificacion;

    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
}
