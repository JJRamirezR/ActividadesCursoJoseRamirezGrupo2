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
@Table(name="Vendedor")

public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvendedor", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "create_time", nullable = false)
    private Timestamp createTime;

    @Column(name = "rfc", nullable = false)
    private String rfc;

    @OneToMany(mappedBy = "vendedor")
    private List<NotificacionVendedor> notificaciones;

    @OneToMany(mappedBy = "vendedor")
    private List<Inventario> inventarios;

    public Vendedor(String nombre, String email, String password,String rfc) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        createTime = new Timestamp(System.currentTimeMillis());
        this.rfc = rfc;
    }
}
