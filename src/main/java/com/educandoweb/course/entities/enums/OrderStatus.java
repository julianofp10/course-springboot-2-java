package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WATTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	//Construtor especial para Enumerados para nao quebrar sequencia na manutencao
	private OrderStatus(int code) {
		this.code = code;
	}
	//Metodo public para acessar
	public int getCode() {
		return code;
	}
	//Metodo static para verificar e validar os status
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
