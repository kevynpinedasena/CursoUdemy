package com.kevyn.arreglos;

public class EjemploArreglosParesImpares {

	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 53};
		
		System.out.println("Numeros Pares");
		for (int i = 0; i < numeros.length; i++) {
			if( numeros[i] % 2 == 0) {
				System.out.print(numeros[i]+" ");
			}
		}
		
		System.out.println();
		
		System.out.println("Numeros Impares");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i]+" ");
			}
		}
	}

}
