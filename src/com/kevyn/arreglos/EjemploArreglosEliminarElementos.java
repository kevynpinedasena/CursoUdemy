package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class EjemploArreglosEliminarElementos {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			numeros[i] = num;
		}
		
		System.out.println();
		
		int eliminarPosi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la osicion a eliminar de 0 a 9"));
		
		for (int i = eliminarPosi; i < numeros.length - 1; i++) {
			numeros[i] = numeros[i+1];
		}

		System.out.println("Arreglo numeros");
		for (int i = 0; i < numeros.length-1; i++) {
			System.out.println(i+ " = " +numeros[i]);
		}
		
		int[] numeros2 = new int[numeros.length-1];
		System.arraycopy(numeros, 0, numeros2, 0, numeros2.length);
		
		System.out.println("\nArreglo numeros2");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(i+ " = " +numeros2[i]);
		}
		
	}

}
