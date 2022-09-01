package com.kevyn.arreglos;


import javax.swing.JOptionPane;

public class EjemploArreglosDesplazarPosicion {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		int ultimo;
		
		
		for (int i = 0; i < numeros.length; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"));
			numeros[i] = num;
		}
		
		//para imprimir un arreglo al reves
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

		
		
		ultimo = numeros[numeros.length-1];
		
		for (int i = numeros.length-2; i >= 0; i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
		
		System.out.println("El Arreglo: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
