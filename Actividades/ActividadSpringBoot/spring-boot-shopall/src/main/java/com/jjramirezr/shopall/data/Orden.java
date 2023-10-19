package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorden", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcliente",nullable = false)
    private Cliente cliente;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;

    @Column(name = "estatus", nullable = false)
    private String estatus;

    @OneToMany(mappedBy = "orden")
    private List<Compra> items;

    public Orden(Cliente cliente, String estatus) {
        this.cliente = cliente;
        this.estatus = estatus;
        total = 0.0;
        fecha = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", total=" + total +
                ", fecha=" + fecha +
                ", estatus='" + estatus + '\'' +
                '}';
    }
}
