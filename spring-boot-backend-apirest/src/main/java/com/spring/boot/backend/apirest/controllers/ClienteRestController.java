package com.spring.boot.backend.apirest.controllers;

import com.spring.boot.backend.apirest.models.entity.Cliente;
import com.spring.boot.backend.apirest.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
/* Con crossOrigin definimos lo que permitimos y los metodos tb */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController // Como es un Api rest, usamos RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteServices iclienteServices;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return iclienteServices.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable long id){
      return iclienteServices.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED) // Con CREATE se crea un 201
    public Cliente create(@RequestBody  Cliente cliente ){
      return iclienteServices.save(cliente);
    }

    /*el cliente es el que viene por body
    * y el id es para buscar el qe viene por id
    * */
    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public  Cliente update(
      @RequestBody Cliente cliente ,
      @PathVariable long id){
      Cliente clienteActual = iclienteServices.findById(id);
      clienteActual.setApellido(cliente.getApellido());
      clienteActual.setNombre(cliente.getNombre());
      clienteActual.setEmail(cliente.getEmail());
      return iclienteServices.save(clienteActual);
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
      iclienteServices.delete(id);
    }

}
