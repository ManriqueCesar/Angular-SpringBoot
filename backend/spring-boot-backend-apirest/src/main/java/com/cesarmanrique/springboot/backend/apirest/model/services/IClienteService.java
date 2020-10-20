package com.cesarmanrique.springboot.backend.apirest.model.services;

import java.util.List;

import com.cesarmanrique.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findall();
}
