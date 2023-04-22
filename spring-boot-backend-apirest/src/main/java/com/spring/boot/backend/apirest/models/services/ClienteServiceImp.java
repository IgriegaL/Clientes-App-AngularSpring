package com.spring.boot.backend.apirest.models.services;

import com.spring.boot.backend.apirest.models.dao.IclienteDao;
import com.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // hace que sea un componente de Spring
public class ClienteServiceImp implements IClienteServices {

    @Autowired
    private IclienteDao iclienteDao;
    @Override
    @Transactional(readOnly = true) // como es un select, se le coloca solo lectura true
    public List<Cliente> findAll() {
        return (List<Cliente>) iclienteDao.findAll();
    }
}
