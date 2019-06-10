package com.siqueira76.payment.domain;

import java.io.Serializable;

import com.siqueira76.payment.dto.BuyerDTO;
import com.siqueira76.payment.dto.CardDTO;
import com.siqueira76.payment.dto.ClientDTO;
import com.siqueira76.payment.dto.PaymentDTO;

public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private ClientDTO client;
	private BuyerDTO buyer;
	private PaymentDTO payment;
	private CardDTO card;
	
	private String boleto;
	private String cartao;
	
	public Transaction() {
	}

	public Transaction(String id, ClientDTO client, BuyerDTO buyer, PaymentDTO payment, CardDTO card) {
		this.id = id;
		this.client = client;
		this.buyer = buyer;
		this.payment = payment;
		this.card = card;
	}

	public CardDTO getCard() {
		return card;
	}

	public void setCard(CardDTO card) {
		this.card = card;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public BuyerDTO getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerDTO buyer) {
		this.buyer = buyer;
	}

	public PaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}
	
	public String getBoleto() {
		return "863296950692105610265098616589109";
	}
	
	public String getCartao() {
		return "Sucesso";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
