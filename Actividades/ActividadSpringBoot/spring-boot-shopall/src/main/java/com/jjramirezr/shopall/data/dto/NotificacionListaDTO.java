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

    public NotificacionListaDTO() {
    }

    public NotificacionListaDTO(String nombre, String email, List<NotificacionDTO> notificacionesDTO) {
        this.nombre = nombre;
        this.email = email;
        this.notificacionesDTO = notificacionesDTO;
    }
}
