package com.gpsfishing.model.enums;

public enum MoonPhase {

	NOVA(1),
	CRESCENTE(2),
	CHEIA(3),
	MINGUANTE(4);
	
	private Integer value;

	private MoonPhase(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
