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

    private Integer idCliente;
    private Integer idInventario;

    @Column(name = "Notificacion", nullable = false)
    private String Notificacion;

    @Column(name = "Fecha")
    private Timestamp fecha;
}
