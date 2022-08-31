package com.kevyn.arreglos;


public class EjemploArregloFor {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+2;
		}
		
		for (int j = 0; j < numeros.length; j++) {
			System.out.println(numeros[j]);
		}
	}

}
