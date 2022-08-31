package com.kevyn.clasesWrapper;

class Persona{
	
	private String nombre;
	
	public void madificarNombre(String nombreNuevo) {
		nombre = nombreNuevo;
	}
	
	public String leerNombre() {
		return this.nombre;
	}
}

public class PasarPorReferencia2 {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		persona.madificarNombre("andres");

		System.out.println("iniciamos el metodo main");
		
		System.out.println("persona.nombre = "+ persona.leerNombre());
		
		System.out.println("Antes de llqamar al metodo text");
		test(persona);
		
		System.out.println("despues de llamnar al metodo test");
		
		System.out.println("persona.nombre = "+persona.leerNombre());
		
		System.out.println("Finaliza el metodo main con los datos del arreglo");
	}
	
	public static void test(Persona persona) {
		System.out.println("Iniciamos al metodo test");
		persona.madificarNombre("Pepe");
		System.out.println("Finaliza el metodo test");
	}

}
