package com.siqueira76.payment.dto;

import java.io.Serializable;

import com.siqueira76.payment.dto.enuns.Type;

public class PaymentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer amount;
	private Integer type;

	
	public PaymentDTO() {
	}

	public PaymentDTO(Integer id, Integer amount, Type type) {
		this.id = id;
		this.amount = amount;
		this.type = type.getCod();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Type getType() {
		return Type.toEnum(type);
	}

	public void setType(Type type) {
		this.type = type.getCod();
	}


}