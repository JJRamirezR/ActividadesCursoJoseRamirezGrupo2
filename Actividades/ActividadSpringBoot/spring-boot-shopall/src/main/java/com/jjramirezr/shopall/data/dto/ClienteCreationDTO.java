package com.jjramirezr.shopall.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClienteCreationDTO {
    private String name;
    private String email;
    private String password;

}
