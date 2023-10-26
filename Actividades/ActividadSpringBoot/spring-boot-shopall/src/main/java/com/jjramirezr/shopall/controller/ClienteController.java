package com.jjramirezr.shopall.controller;

import com.jjramirezr.shopall.data.dto.ClienteCreationDTO;
import com.jjramirezr.shopall.data.dto.UsuarioDTO;
import com.jjramirezr.shopall.data.dto.NotificacionListaDTO;
import com.jjramirezr.shopall.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/lista")
    public List<UsuarioDTO> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{clienteId}")
    public UsuarioDTO getCliente(@PathVariable int clienteId){
        return clienteService.findById(clienteId);
    }

    @GetMapping("/{clienteId}/notificaciones")
    public NotificacionListaDTO getNotificacions(@PathVariable int clienteId){
        return clienteService.getNotificaciones(clienteId);
    }
    @PostMapping("/nuevo")
    public ClienteCreationDTO addCliente(@Valid @RequestBody ClienteCreationDTO clienteDTO){
        return clienteService.saveCliente(clienteDTO);
    }

}
