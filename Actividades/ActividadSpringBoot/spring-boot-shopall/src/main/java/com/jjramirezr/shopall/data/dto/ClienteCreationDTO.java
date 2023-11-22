package com.jjramirezr.shopall.data.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@AllArgsConstructor
@Validated
public class ClienteCreationDTO {
    @NotBlank(message = "Ingresar nombre")
    private String name;

    @Email(message = "Ingresar un formato de email válido")
    private String email;

    @NotBlank(message = "Ingresar password")
    private String password;

}
