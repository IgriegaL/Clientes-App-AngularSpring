package com.spring.boot.backend.apirest.models.dao;

import com.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IclienteDao extends CrudRepository<Cliente,Long> {
}
