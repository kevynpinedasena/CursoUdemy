package com.kevyn.clasesWrapper;

public class PasarPorValor {

	public static void main(String[] args) {
		
		Integer i = 10;
		
		System.out.println("Iniciamos el main con i = "+i);
		
		text(i);
		System.out.println("Finaliza el metodo main con la (se mantiene igual) i = "+i);

	}
	
	public static void text (Integer i) {
		System.out.println("iniciamos el metodo text con i = "+i);
		i = 35;
		System.out.println("finaliza el metodo text con i = "+i);
	}

}
