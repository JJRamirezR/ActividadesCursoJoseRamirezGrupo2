package com.jjramirezr.shopall.service;

import com.jjramirezr.shopall.data.CategoriaProducto;
import com.jjramirezr.shopall.data.Inventario;
import com.jjramirezr.shopall.data.Vendedor;
import com.jjramirezr.shopall.data.dto.InventarioCreationDTO;
import com.jjramirezr.shopall.repository.CategoriaProductoRepository;
import com.jjramirezr.shopall.repository.InventarioRepository;
import com.jjramirezr.shopall.repository.VendedorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;
    @Autowired
    VendedorRepository vendedorRepository;

    @Autowired
    CategoriaProductoRepository categoriaProductoRepository;

    @Transactional
    public InventarioCreationDTO saveProducto(int vendedorId, InventarioCreationDTO nuevoDTO) {
        Vendedor vendedor = vendedorRepository.getReferenceById(vendedorId);
        CategoriaProducto categoria = categoriaProductoRepository.getReferenceById(nuevoDTO.getCategoria());
        inventarioRepository.save(new Inventario(vendedor,categoria,
                nuevoDTO.getNombre(), nuevoDTO.getDescripcion(), nuevoDTO.getUnidad(), nuevoDTO.getStock(),
                nuevoDTO.getPrecioUnitario()));

        return  nuevoDTO;

    }
}
