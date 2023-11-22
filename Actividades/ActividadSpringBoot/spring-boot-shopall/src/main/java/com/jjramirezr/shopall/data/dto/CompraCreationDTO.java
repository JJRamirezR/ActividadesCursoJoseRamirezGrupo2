package com.jjramirezr.shopall.data.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@Validated
public class CompraCreationDTO {
    @NotBlank(message = "Ingresar id de inventario valido")
    @Positive(message = "Ingresar id de inventario valido")
    private int idInventario;

    @NotBlank(message = "Ingresar una cantidad valida")
    @Positive(message = "Ingresa una cantidad valida")
    private int cantidad;

}
