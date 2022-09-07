package com.kevyn.Poo;

public enum Color {
	
	ROJO("Rojo"),
	AMARILLO("Amarillo"),
	AZUL("Azul"),
	BLANCO("Blanco"),
	GRIS("Gris"),
	NARANJO("Naranjo");
	
	private final String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
}
