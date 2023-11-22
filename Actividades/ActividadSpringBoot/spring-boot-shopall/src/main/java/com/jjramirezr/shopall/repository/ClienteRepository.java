package com.jjramirezr.shopall.repository;

import com.jjramirezr.shopall.data.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
