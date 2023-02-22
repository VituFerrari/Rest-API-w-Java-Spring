package com.algaworks.algalog.api.controller;

//import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;


@RestController
public class ClienteController {

	@PersistenceContext
	public EntityManager manager;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {

		return manager.createQuery("from cliente", Cliente.class)
				.getResultList();


/*		Cliente cliente1 = new Cliente();
		cliente1.setNome("joão p");
		cliente1.setEmail("joaojoao@alga.com");
		cliente1.setTelefone("11 54685-1245");

		return Arrays.asList(cliente1);*/
		

	}
	
}
