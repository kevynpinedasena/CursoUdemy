package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class EjemploArreglosDesplazarPosicios2 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int elemento, posicion;
		
		for (int i = 0; i < numeros.length-1; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros"));
			numeros[i] = num;
		}
		
		elemento = Integer.parseInt(JOptionPane.showInputDialog("Nuevo elemento"));
		
		posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion donde agregar (0 al 9)"));

		for (int i = numeros.length-2; i >= posicion; i--) {
			numeros[i+1] = numeros[i];
		}
		
		numeros[posicion] = elemento;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
