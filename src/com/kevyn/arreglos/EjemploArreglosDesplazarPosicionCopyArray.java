package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class EjemploArreglosDesplazarPosicionCopyArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int elemento, posicion, ultimo;
		
		for (int i = 0; i < numeros.length; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros"));
			numeros[i] = num;
		}
		
		elemento = Integer.parseInt(JOptionPane.showInputDialog("Nuevo elemento"));
		posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion donde agregar (0 al 9)"));
		ultimo = numeros[numeros.length - 1];
		
		for (int i = numeros.length-2; i >= posicion; i--) {
			numeros[i+1] = numeros[i];
		}
		
		int[] copiaArregloNumero = new int[numeros.length+1];
		System.arraycopy(numeros, 0, copiaArregloNumero, 0, numeros.length);
		numeros = copiaArregloNumero;
		copiaArregloNumero[posicion] = elemento;
		
		numeros[numeros.length - 1] = ultimo;
		
		System.out.println("El arreglo");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
