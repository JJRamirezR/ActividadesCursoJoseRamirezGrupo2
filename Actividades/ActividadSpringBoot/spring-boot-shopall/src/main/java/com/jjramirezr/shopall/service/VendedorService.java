package com.jjramirezr.shopall.service;

import com.jjramirezr.shopall.data.Cliente;
import com.jjramirezr.shopall.data.NotificacionVendedor;
import com.jjramirezr.shopall.data.Vendedor;
import com.jjramirezr.shopall.data.dto.NotificacionDTO;
import com.jjramirezr.shopall.data.dto.NotificacionListaDTO;
import com.jjramirezr.shopall.data.dto.UsuarioDTO;
import com.jjramirezr.shopall.data.dto.VendedorCreationDTO;
import com.jjramirezr.shopall.repository.VendedorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository vendedorRepository;

    public List<UsuarioDTO> findAll(){
        List<UsuarioDTO> listaClientes = new ArrayList<>();
        for(Vendedor vendedor: vendedorRepository.findAll()){
            listaClientes.add(new UsuarioDTO(vendedor.getNombre(), vendedor.getEmail(),
                    vendedor.getCreateTime()));
        }
        return listaClientes;
    }

    public NotificacionListaDTO getNotificaciones(int vendedorId) {
        Vendedor vendedor = vendedorRepository.getReferenceById(vendedorId);
        List<NotificacionDTO> notificaciones = new ArrayList<>();
        for(NotificacionVendedor notificacion: vendedor.getNotificaciones()){
            NotificacionDTO notificacionDto = new NotificacionDTO(notificacion.getNotificacion(),
                    notificacion.getFecha());
            notificaciones.add(notificacionDto);
        }
        return new NotificacionListaDTO(vendedor.getNombre(),
                vendedor.getEmail(), notificaciones);
    }

    @Transactional
    public VendedorCreationDTO saveVendedor(VendedorCreationDTO vendedorDTO) {
        vendedorRepository.save(new Vendedor(vendedorDTO.getName(), vendedorDTO.getEmail(),
                vendedorDTO.getPassword(),vendedorDTO.getRfc()));
        return vendedorDTO;
    }
}
