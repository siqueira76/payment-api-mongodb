package com.siqueira76.payment.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.siqueira76.payment.domain.Client;
import com.siqueira76.payment.repository.ClientRepository;

@Configuration
public class Instantiation implements CommandLineRunner  {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		clientRepository.deleteAll();
		
		Client cli1 = new Client();
		clientRepository.saveAll(Arrays.asList(cli1));
		
	}

}
