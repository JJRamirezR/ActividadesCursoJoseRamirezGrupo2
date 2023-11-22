package com.jjramirezr.shopall.controller;

import com.jjramirezr.shopall.data.dto.InventarioCreationDTO;
import com.jjramirezr.shopall.service.InventarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;

    //Crear un nuevo producto
    @PostMapping("/nuevo/{vendedorId}")
    public InventarioCreationDTO addProducto(@PathVariable int vendedorId,
                                             @Valid @RequestBody InventarioCreationDTO nuevoDTO){
        return inventarioService.saveProducto(vendedorId,nuevoDTO);

    }
}
