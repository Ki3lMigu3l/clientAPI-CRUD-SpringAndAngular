package com.github.ki3lmigu3l.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ki3lmigu3l.api.model.Cliente;
import com.github.ki3lmigu3l.api.repository.ClienteRepository;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
         return clienteRepository.save(cliente);
    }
}
