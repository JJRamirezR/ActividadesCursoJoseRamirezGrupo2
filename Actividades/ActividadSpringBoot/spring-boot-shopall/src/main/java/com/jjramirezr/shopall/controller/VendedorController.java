package com.jjramirezr.shopall.controller;

import com.jjramirezr.shopall.data.dto.NotificacionListaDTO;
import com.jjramirezr.shopall.data.dto.UsuarioDTO;
import com.jjramirezr.shopall.data.dto.VendedorCreationDTO;
import com.jjramirezr.shopall.service.VendedorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @GetMapping("/lista")
    public List<UsuarioDTO> findAll(){return vendedorService.findAll();}
    @GetMapping("/{vendedorId}/notificaciones")
    public NotificacionListaDTO getNotificaciones(@PathVariable int vendedorId){
        return vendedorService.getNotificaciones(vendedorId);
    }

    @PostMapping("/nuevo")
    public VendedorCreationDTO addVendedor(@Valid @RequestBody VendedorCreationDTO vendedorDTO){
        return vendedorService.saveVendedor(vendedorDTO);
    }




}
