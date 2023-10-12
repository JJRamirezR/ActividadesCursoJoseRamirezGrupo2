package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClienteNotificacionDTO {
    //clase para mostrar las notificaciones
    private String nombre;
    private String email;
    private List<NotificacionDTO> notificacionesDTO;
}
