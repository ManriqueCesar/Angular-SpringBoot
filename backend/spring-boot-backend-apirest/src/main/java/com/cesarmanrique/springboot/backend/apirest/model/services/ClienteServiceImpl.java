package com.cesarmanrique.springboot.backend.apirest.model.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cesarmanrique.springboot.backend.apirest.models.dao.IClienteDao;
import com.cesarmanrique.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl  implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly= true)
	public List<Cliente> findall() {
		return (List<Cliente>) clienteDao.findAll();
	}

}
