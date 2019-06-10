package com.siqueira76.payment.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siqueira76.payment.domain.Transaction;
import com.siqueira76.payment.service.TransactionService;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionResource {
	
	@Autowired
	TransactionService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Transaction> findById(@PathVariable String id) {
		Transaction obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ResponseEntity<String> insert(@RequestBody Transaction obj, @PathVariable String id) {
		obj = service.insert(obj, id);
		return ResponseEntity.ok().body(service.result(obj)); 
	}

}
