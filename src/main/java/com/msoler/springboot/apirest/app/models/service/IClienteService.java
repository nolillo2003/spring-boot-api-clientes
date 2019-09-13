package com.msoler.springboot.apirest.app.models.service;

import java.util.List;

import com.msoler.springboot.apirest.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
