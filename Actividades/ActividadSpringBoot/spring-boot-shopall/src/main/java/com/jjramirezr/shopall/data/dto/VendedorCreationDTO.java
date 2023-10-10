package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendedorCreationDTO {
    private String name;
    private String email;
    private String password;
    private String rfc;
}
