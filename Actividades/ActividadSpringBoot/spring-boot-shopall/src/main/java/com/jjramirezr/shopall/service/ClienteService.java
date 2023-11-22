package com.jjramirezr.shopall.service;

import com.jjramirezr.shopall.data.Cliente;
import com.jjramirezr.shopall.data.NotificacionCliente;
import com.jjramirezr.shopall.data.dto.ClienteCreationDTO;
import com.jjramirezr.shopall.data.dto.UsuarioDTO;
import com.jjramirezr.shopall.data.dto.NotificacionListaDTO;
import com.jjramirezr.shopall.data.dto.NotificacionDTO;
import com.jjramirezr.shopall.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<UsuarioDTO> findAll(){
        List<UsuarioDTO> listaClientes = new ArrayList<>();
        for(Cliente cliente: clienteRepository.findAll()){
            listaClientes.add(new UsuarioDTO(cliente.getNombre(), cliente.getEmail(),
                    cliente.getCreateTime()));
        }
        return listaClientes;
    }

    public UsuarioDTO findById(int clienteId){
        Cliente cliente = clienteRepository.getReferenceById(clienteId);
        return new UsuarioDTO(cliente.getNombre(), cliente.getEmail(),
                cliente.getCreateTime());
    }

    public NotificacionListaDTO getNotificaciones(int clienteId){
        //Creando DTO que contiene nombre, email y lista de notificaciones
        Cliente cliente = clienteRepository.getReferenceById(clienteId);
        List<NotificacionDTO> notificaciones = new ArrayList<>();
        for(NotificacionCliente notificacion: cliente.getNotificaciones()){
            NotificacionDTO notificacionDto = new NotificacionDTO(notificacion.getNotificacion(),
                    notificacion.getFecha());
            notificaciones.add(notificacionDto);
        }
        return new NotificacionListaDTO(cliente.getNombre(),
                cliente.getEmail(), notificaciones);
    }
    @Transactional
    public ClienteCreationDTO saveCliente(ClienteCreationDTO clienteDTO) {
        clienteRepository.save(new Cliente(clienteDTO.getName(), clienteDTO.getEmail(),
                clienteDTO.getPassword()));

        return clienteDTO;
    }
}
