package com.siqueira76.payment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siqueira76.payment.domain.Client;
import com.siqueira76.payment.repository.ClientRepository;
import com.siqueira76.payment.service.exception.ObjectNotFoundException;


@Service
public class ClientService {
	
	@Autowired
	ClientRepository repo;
	
	public List<Client> findAll() {
		return repo.findAll();
	}
	
	public Client findById(String id) {
		Optional<Client> client = repo.findById(id);
		return client.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Client insert(Client client) {
		return repo.insert(client);
	}
	
	public Client save(Client client) {
		return repo.save(client);
	}

}
