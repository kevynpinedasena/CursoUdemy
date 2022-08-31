package com.kevyn.clasesmath;

public class EjemploClaseMath {

	public static void main(String[] args) {
		
		int absoluto = Math.abs(-3);
		System.out.println("absoluto = "+absoluto);

		absoluto = Math.abs(3);
		
		double max = Math.max(3.5, 1.2);
		System.out.println("maximo = "+max);
		
		double min = Math.min(3.5, 1.2);
		System.out.println("menor = "+min);
		
		double techo = Math.ceil(3.5);
		System.out.println("techo = "+techo);
		
		double piso = Math.floor(3.5);
		System.out.println("piso = "+piso);
		
		long entero = Math.round(3.5);
		System.out.println("entero = "+entero);
		
		long pi = Math.round(Math.PI);
		System.out.println("Redondear el numero PI = "+pi);
	}

}
