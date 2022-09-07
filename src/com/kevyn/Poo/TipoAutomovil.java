package com.kevyn.Poo;

public enum TipoAutomovil {
	
	SEDAN("Sedan", "Auto normal", 4),
	STATION_WAGON("Station Wagon", "Auto Grande", 4),
	HATCHBACK("Hatchback", "Auto compacto", 4),
	PICKUP("Pickup", "Camioneta", 4),
	COUPE("Coupe", "Auto Pequeño", 2),
	CONVERTIBLE("Convertible", "Auto Deportivo", 2),
	FURGON("Furgon", "Auto Utilitario", 2);
	
	private final String nombre;
	private final String descripcion;
	private final int numeroPuertas;
	
	private TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numeroPuertas = numeroPuertas;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
