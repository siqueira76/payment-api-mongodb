package com.siqueira76.payment.dto;

import java.io.Serializable;

import com.siqueira76.payment.domain.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	public ClientDTO() {
	}

	public ClientDTO(Client client) {
		this.id = client.getId();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
