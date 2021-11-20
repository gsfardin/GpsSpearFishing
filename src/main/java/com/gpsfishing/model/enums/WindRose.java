package com.gpsfishing.model.enums;

public enum WindRose {

	NORTE("N"),
	NORDESTE("NE"),
	LESTE("L"),
	SUDESTE("SE"),
	SUL("S"),
	SUDOESTE("SO"),
	OESTE("O"),
	NOROESTE("NO");

	private String value;

	private WindRose(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
