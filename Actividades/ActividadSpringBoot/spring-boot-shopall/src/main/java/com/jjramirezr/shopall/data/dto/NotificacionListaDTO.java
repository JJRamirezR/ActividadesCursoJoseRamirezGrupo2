package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NotificacionListaDTO {
    //clase para mostrar las notificaciones asociadas a un usuario
    //Usuario -> cliente o vendedor
    private String nombre;
    private String email;
    private List<NotificacionDTO> notificacionesDTO;
}
