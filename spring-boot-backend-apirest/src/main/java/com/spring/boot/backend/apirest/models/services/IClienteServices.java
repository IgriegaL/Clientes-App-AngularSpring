package com.spring.boot.backend.apirest.models.services;

import com.spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteServices {

    // Le damos los metodos para implementar los de la
    public List<Cliente> findAll();

}
