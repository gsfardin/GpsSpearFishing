package com.gpsfishing.model.enums;

public enum BeaufortScale {

	CALMARIA(0, "Calmaria", "Calm"),
	BAFAGEM(1, "Bafagem", "Light Air"),
	ARAGEM(2, "Aragem", "Light Breeze"),
	FRACO(3, "Fraco", "Gentle Breeze"),
	MODERADO(4, "Moderado", "Moderate Breeze"),
	FRESCO(5, "Fresco", "Fresh Breeze"),
	MUITO_RESCO(6, "Muito Fresco", "Strong Breeze"),
	FORTE(7, "Forte", "Near Gale"),
	MUITO_FORTE(8, "Muito Forte", "Gale"),
	DURO(9, "Duro", "Severe Gale"),
	MUITO_DURO(10, "Muito Duro", "Storm"),
	TEMPESTUOSO(11, "Tempestuoso", "Violent Storm"),
	FURACAO(12, "Furacao", "Hurricane");
	
	private Integer code;
	private String descriptionPtbr;
	private String descriptionEn;
	
	private BeaufortScale(Integer code, String descriptionPtbr, String descriptionEn) {
		this.code = code;
		this.descriptionPtbr = descriptionPtbr;
		this.descriptionEn = descriptionEn;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescriptionPtbr() {
		return descriptionPtbr;
	}

	public String getDescriptionEn() {
		return descriptionEn;
	}
}
