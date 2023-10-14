package com.jjramirezr.shopall.repository;

import com.jjramirezr.shopall.data.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario,Integer> {
}
