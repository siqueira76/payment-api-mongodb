package com.siqueira76.payment.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siqueira76.payment.domain.Client;
import com.siqueira76.payment.domain.Transaction;
import com.siqueira76.payment.dto.ClientDTO;
import com.siqueira76.payment.repository.TransactionRepository;
import com.siqueira76.payment.service.exception.ObjectNotFoundException;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository repoT;
	
	@Autowired
	ClientService clientService;
	
	public Transaction findById(String id) {
		Optional<Transaction> transaction = repoT.findById(id);
		return transaction.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Transaction insert(Transaction obj, String id) {
		Client client = clientService.findById(id);
		ClientDTO clientDTO = new ClientDTO(client);
		obj.setClient(clientDTO);
		repoT.saveAll(Arrays.asList(obj));
		client.getTransactions().addAll(Arrays.asList(obj));
		clientService.save(client);
		return obj;
	}
	
	public String result(Transaction obj) {
		if (obj.getPayment().getType().getCod() == 1) {
			return new Transaction().getCartao();
		}else {
			return new Transaction().getBoleto();
		}
	}
	
}
