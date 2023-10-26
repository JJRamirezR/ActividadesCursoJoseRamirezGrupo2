package com.jjramirezr.shopall.data.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class InventarioCreationDTO {
    @NotNull(message = "Ingresar id de categoria valido")
    @Positive(message = "Ingresar id de categoria valido")
    private int categoria;

    @NotBlank(message = "Ingresar nombre")
    private String nombre;

    @NotBlank(message = "Ingresar descripcion")
    private String descripcion;

    @NotBlank(message = "Ingresar unidad")
    private String unidad;

    @NotNull(message = "Ingresar una cantidad valida")
    @Positive(message = "Ingresar una cantidad valida")
    private int stock;

    @NotNull(message = "Ingresar una cantidad valida")
    @Positive(message = "Ingresar una cantidad valida")
    private double precioUnitario;
}
