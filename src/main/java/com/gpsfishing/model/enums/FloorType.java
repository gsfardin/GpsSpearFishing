package com.gpsfishing.model.enums;

public enum FloorType {
	
	PEDRA(1),
	AREIA(2),
	OUTROS(3);
	
	private Integer value;

	private FloorType(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
