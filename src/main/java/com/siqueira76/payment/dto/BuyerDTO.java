package com.siqueira76.payment.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class BuyerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String name;
	private String email;
	private String cpf;
	
	public BuyerDTO() {
	}

	public BuyerDTO(Integer id, String name, String email, String cpf) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

