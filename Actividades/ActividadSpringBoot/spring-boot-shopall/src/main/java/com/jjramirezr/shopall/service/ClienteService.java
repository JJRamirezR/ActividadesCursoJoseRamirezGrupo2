package com.jjramirezr.shopall.service;

import com.jjramirezr.shopall.data.Cliente;
import com.jjramirezr.shopall.data.NotificacionCliente;
import com.jjramirezr.shopall.data.dto.ClienteDTO;
import com.jjramirezr.shopall.data.dto.ClienteNotificacionDTO;
import com.jjramirezr.shopall.data.dto.NotificacionClienteDTO;
import com.jjramirezr.shopall.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<ClienteDTO> findAll(){
        List<ClienteDTO> listaClientes = new ArrayList<>();
        for(Cliente cliente: clienteRepository.findAll()){
            ClienteDTO dto = new ClienteDTO();
            dto.setNombre(cliente.getNombre());
            dto.setEmail(cliente.getEmail());
            dto.setCreateTime(cliente.getCreateTime());
            listaClientes.add(dto);
        }
        return listaClientes;
    }

    public ClienteDTO findById(int clienteId){
        ClienteDTO dto = new ClienteDTO();
        Cliente cliente = clienteRepository.getReferenceById(clienteId);
        //Cliente cliente = clienteRepository.findById(clienteId).get();
        dto.setNombre(cliente.getNombre());
        dto.setEmail(cliente.getEmail());
        dto.setCreateTime(cliente.getCreateTime());
        return dto;
    }

    public ClienteNotificacionDTO getNotificaciones(int clienteId){
        //Creando DTO que contiene nombre, email y lista de notificaciones
        ClienteNotificacionDTO dto = new ClienteNotificacionDTO();
        //Colocando los datos del cliente
        Cliente cliente = clienteRepository.getReferenceById(clienteId);
        dto.setNombre(cliente.getNombre());
        dto.setEmail(cliente.getEmail());
        //Generando lista de notificaciones
        List<NotificacionClienteDTO> notificaciones = new ArrayList<>();

        for(NotificacionCliente notificacion: cliente.getNotificaciones()){
            NotificacionClienteDTO notificacionDto = new NotificacionClienteDTO();
            notificacionDto.setNotificacion(notificacion.getNotificacion());
            notificaciones.add(notificacionDto);
        }
        dto.setNotificacionesDTO(notificaciones);
        return dto;
    }

    //Función de prueba para mostrar el usuario y sus notificaciones
    public List<ClienteNotificacionDTO> prueba(){
        List<ClienteNotificacionDTO> clientes = new ArrayList<>();
        Iterable<Cliente> listaCliente = clienteRepository.findAll();
        for(Cliente cliente:listaCliente){
            //System.out.println(cliente);
            //System.out.println(cliente.getNotificaciones());
            ClienteNotificacionDTO dto = new ClienteNotificacionDTO();
            //setear nombre e email para todas las instancias
            dto.setNombre(cliente.getNombre());
            dto.setEmail(cliente.getEmail());
            //crear y asignar lista de notificaciones
            List<NotificacionClienteDTO> notificaciones = new ArrayList<>();
            for(NotificacionCliente notificacion: cliente.getNotificaciones()){
                NotificacionClienteDTO notDto = new NotificacionClienteDTO();
                System.out.println(notificacion.getNotificacion());
                notDto.setNotificacion(notificacion.getNotificacion());
                System.out.println("En dto: " + notDto.getNotificacion());
                notificaciones.add(notDto);
            }
            //setar la lista de las notificaciones
            dto.setNotificacionesDTO(notificaciones);
            //Guardar dto
            clientes.add(dto);
        }

        return clientes;
    }




}
