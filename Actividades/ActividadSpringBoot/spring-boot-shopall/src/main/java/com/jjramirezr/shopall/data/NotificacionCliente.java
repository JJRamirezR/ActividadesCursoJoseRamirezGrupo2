package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="Notificacion_Cliente")
public class NotificacionCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnotificacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    @Column(name = "notificacion", nullable = false)
    private String Notificacion;

    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;

    @Override
    public String toString() {
        return "NotificacionCliente{" +
                "id=" + id +
                ", Notificacion='" + Notificacion + '\'' +
                '}';
    }
}
