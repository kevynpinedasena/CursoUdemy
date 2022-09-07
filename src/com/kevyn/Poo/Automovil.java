package com.kevyn.Poo;

public class Automovil {

	private String fabricante;
	private String modelo;
	private Color color = Color.GRIS;
	private double cilindrada;
	private int capacidadTanque;
	private static Color colorPatente = Color.NARANJO;
	private TipoAutomovil tipo;
	
	public Automovil() {

	}

	public Automovil(String fabricante, String modelo, Color color, TipoAutomovil tipo, double cilindrada, int capacidadTanque) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
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
	
	public static Color getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(Color colorPatente) {
		Automovil.colorPatente = colorPatente;
	}

	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindrada="
				+ cilindrada + ", capacidadTanque=" + capacidadTanque + ", tipo=" + tipo + "]";
	}

	public String imprimirInformacion() {
		String imprimir = "Fabricante = " + this.fabricante;
		imprimir += "\nModelo = " + this.modelo;
		imprimir += "\nColor = " + this.color.getColor();
		imprimir += "\nTipo = " + this.getTipo().getNombre();
		imprimir += "\nNumero de puertas = " + this.getTipo().getNumeroPuertas();
		imprimir += "\nDescripcion = " + this.getTipo().getDescripcion();
		imprimir += "\nCilindrada = " + this.cilindrada;
		imprimir += "\nColor patente = " + Automovil.colorPatente;
		
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
