package com.jjramirezr.shopall.controller;

import com.jjramirezr.shopall.data.dto.CompraCreationDTO;
import com.jjramirezr.shopall.service.CompraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    private CompraService compraService;


    @PostMapping("/{clienteId}/nuevo")
    public List<CompraCreationDTO> saveCompra(@PathVariable int clienteId,
                                               @RequestBody List<CompraCreationDTO> listaDTO){
        return compraService.saveCompra(clienteId,listaDTO);
    }

}
