package com.jjramirezr.shopall.controller;

import com.jjramirezr.shopall.data.dto.ClienteDTO;
import com.jjramirezr.shopall.data.dto.ClienteNotificacionDTO;
import com.jjramirezr.shopall.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/lista")
    public List<ClienteDTO> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{clienteId}")
    public ClienteDTO getCliente(@PathVariable int clienteId){
        return clienteService.findById(clienteId);
    }

    @GetMapping("/{clienteId}/notificaciones")
    public ClienteNotificacionDTO getNotificacions(@PathVariable int clienteId){
        return clienteService.getNotificaciones(clienteId);
    }

    @GetMapping("/clientes")
    public List<ClienteNotificacionDTO> prueba(){
        return clienteService.prueba();
    }
}
