package com.github.ki3lmigu3l.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ki3lmigu3l.api.model.Cliente;
import com.github.ki3lmigu3l.api.repository.ClienteRepository;

@RestController
@RequestMapping("cliente")
@CrossOrigin(origins = "*")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
         return clienteRepository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes () {
        return clienteRepository.findAll();
    }

    @PutMapping
    public Cliente editarCliente (@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("{id}")
    public void deletarCliente (@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
