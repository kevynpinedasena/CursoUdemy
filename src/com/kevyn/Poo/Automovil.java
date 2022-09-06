package com.kevyn.Poo;

public class Automovil {

	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	private int capacidadTanque;
	
	public Automovil() {

	}
	
	public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cilindrada = cilindrada;
		this.capacidadTanque = capacidadTanque;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	
	
	public String imprimirInformacion() {
		String imprimir = "Fabricante = " + this.fabricante;
		imprimir += "\nModelo = " + this.modelo;
		imprimir += "\nColor = " + this.color;
		imprimir += "\nCilindrada = " + this.cilindrada;
		
		return imprimir;
	}
	
	public String acelerar (int rpm) {
		return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
	}
	
	public String frenar () {
		return this.fabricante + " " + this.modelo + " Frenando!";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();

		return acelerar + "\n" + frenar;
	}
	
	public double calcularConsumo(int km, int porcentajeBencina) {
		return km/(capacidadTanque*(porcentajeBencina/100f));
	}
	
	
}
