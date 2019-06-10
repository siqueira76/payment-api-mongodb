package com.siqueira76.payment.dto.enuns;

public enum Type {
	
	CARTAO(1),
	BOLETO(2);
	
	private int cod;
	
	private Type(int cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}
	
	public static Type toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(Type t : Type.values()) {
			if(cod.equals(t.getCod())) {
				return t;
			}
		}
		throw new IllegalArgumentException("Tipo invalido "+ cod);
	}

}
