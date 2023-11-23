package com.github.ki3lmigu3l.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ki3lmigu3l.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
