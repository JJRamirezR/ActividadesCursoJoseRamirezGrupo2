package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class VendedorDTO {
    private String nombre;
    private String email;
    private Timestamp createTime;

}
