package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class NotificacionClienteDTO {
    //private ClienteDTO cliente;
    private String Notificacion;
    private Timestamp fecha;
}
