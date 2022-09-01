package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class EjemploArreglosParesInpares {

	public static void main(String[] args) {
		
		//declarando los arreglos
		int[] numeros, pares, impares;
		
		//declarando variables de incremento
		int totalPares = 0, totalImpares = 0;
		
		//se inicializa el arreglo de los numeros y hace el for para ingresar los datos
		numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			int ingresar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero en la posicion "+i));
			numeros[i] = ingresar;
		}
		

		//for para sacar pares y impares para incrementarlas con las variables
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				totalPares++;
			}
			else {
				totalImpares++;
			}
		}
		
		//iniciamos los arreglos donde se van a guardar los pares e impares
		pares = new int[totalPares];
		impares = new int[totalImpares];
		
		int par = 0, impart = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares[par++] = numeros[i];
			}
			else {
				impares[impart++] = numeros[i];
			}
		}
		
		System.out.println("Pares");
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + "  ");
		}
		
		System.out.println("\nImpares");
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[i] + "  ");
		}
	}

}
