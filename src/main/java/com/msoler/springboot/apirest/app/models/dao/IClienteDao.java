package com.msoler.springboot.apirest.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.msoler.springboot.apirest.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
