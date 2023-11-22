package com.jjramirezr.shopall.service;

import com.jjramirezr.shopall.data.Cliente;
import com.jjramirezr.shopall.data.Compra;
import com.jjramirezr.shopall.data.Inventario;
import com.jjramirezr.shopall.data.Orden;
import com.jjramirezr.shopall.data.dto.CompraCreationDTO;
import com.jjramirezr.shopall.repository.ClienteRepository;
import com.jjramirezr.shopall.repository.CompraRepository;
import com.jjramirezr.shopall.repository.InventarioRepository;
import com.jjramirezr.shopall.repository.OrdenRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    CompraRepository compraRepository;
    @Autowired
    OrdenRepository ordenRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    InventarioRepository inventarioRepository;

    @Transactional
    public List<CompraCreationDTO> saveCompra(int clienteId, List<CompraCreationDTO> listaDTO) {

        Cliente cliente = clienteRepository.getReferenceById(clienteId);
        Orden orden = new Orden(cliente, "Creada");
        ordenRepository.save(orden);
        System.out.println(orden);
        double total = 0.0;
        for(CompraCreationDTO productoDTO: listaDTO){
            Inventario producto = inventarioRepository.getReferenceById(productoDTO.getIdInventario());
            int cantidad = productoDTO.getCantidad();
            double precio = cantidad * producto.getPrecioUnitario();
            total +=precio;
            compraRepository.save(new Compra(orden,producto,
                    cantidad, precio));

        }
        orden.setTotal(total);
        ordenRepository.save(orden);

        return listaDTO;
    }

}
