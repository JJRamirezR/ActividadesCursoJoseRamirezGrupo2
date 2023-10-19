package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class NotificacionDTO {
    //private ClienteDTO cliente;
    private String notificacion;
    private Timestamp fecha;

    public NotificacionDTO(){

    }
    public NotificacionDTO(String notificacion, Timestamp fecha) {
        this.notificacion = notificacion;
        this.fecha = fecha;
    }
}
