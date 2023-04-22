package com.spring.boot.backend.apirest.controllers;

import com.spring.boot.backend.apirest.models.entity.Cliente;
import com.spring.boot.backend.apirest.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/* Con crossOrigin definimos lo que permitimos y los metodos tb */
@CrossOrigin(origins = {"http://localhost:8080"})
@RestController // Como es un Api rest, usamos RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteServices iclienteServices;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return iclienteServices.findAll();

    }
}
