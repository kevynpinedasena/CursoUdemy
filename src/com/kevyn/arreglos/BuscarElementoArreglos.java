package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class BuscarElementoArreglos {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros"));
			numeros[i] = num;
		}
		
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
		
//		int i = 0;
//		while (i < numeros.length && numeros[i] != buscar) {
//			i++;
//		}
		
//		if (i == numeros.length) {
//			System.out.println("Numero no encontrado");
//		}
//		else if (numeros[i] == buscar) {
//			System.out.println("Encontrado en la posicion: "+i);
//		}
		
		int i = 0;
		for ( i = 0; i < numeros.length && numeros[i] != buscar; i++) {
		}
		
		if (i == numeros.length) {
			System.out.println("No se encontro");
		}
		else if(numeros[i] == buscar) {
			System.out.println("Se Encontro en la posicion: "+i);
		}

	}

}
