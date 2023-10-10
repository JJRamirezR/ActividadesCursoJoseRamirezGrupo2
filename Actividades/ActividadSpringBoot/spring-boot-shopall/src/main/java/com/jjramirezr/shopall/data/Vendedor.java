package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="Vendedor")

public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVendedor", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "create_time", nullable = false)
    private Timestamp createTime;

    @Column(name = "RFC", nullable = false)
    private String rfc;
}
