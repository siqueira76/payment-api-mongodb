package com.siqueira76.payment.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String holderName;
	private Date expiiration;
	private String cvv;
	
	public CardDTO() {
	}

	public CardDTO(Integer id, String holderName, Date expiiration, String cvv) {
		this.holderName = holderName;
		this.expiiration = expiiration;
		this.cvv = cvv;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Date getExpiiration() {
		return expiiration;
	}

	public void setExpiiration(Date expiiration) {
		this.expiiration = expiiration;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
