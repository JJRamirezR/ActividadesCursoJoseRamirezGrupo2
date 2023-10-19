package com.jjramirezr.shopall.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class CompraCreationDTO {
    private int idInventario;
    private int cantidad;

}
