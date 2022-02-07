package io.github.trabuske.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.trabuske.model.Cliente;
import io.github.trabuske.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteService( ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		clienteRepository.persistir(cliente);
	}

	private void validarCliente(Cliente cliente) {
		// aplica as validações do cliente
		
	}
	
}
