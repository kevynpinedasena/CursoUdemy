package com.kevyn.clasesMatrices;

import javax.swing.JOptionPane;

public class EjemploMatricesColumnasVariable {

	public static void main(String[] args) {
		
		int[][] matricesDeEnteros = {{35, 90, 3, 1978}, {15, 2020, 10, 5}, {677, 127, 32767, 1999}};
		
		int elementoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
		
		boolean encontrado = false;
		int i;
		int j = 0;
		buscar: for (i = 0; i < matricesDeEnteros.length; i++) {
			for (j = 0; j < matricesDeEnteros[i].length; j++) {
				if(matricesDeEnteros[i][j] == elementoBuscar) {
					encontrado = true;
					break buscar;
				}
			}
		}
		
		if (encontrado) {
			System.out.println("Encontrado el numero: " + elementoBuscar + " en las cordenadas "+ i +" - " + j);
		}
		else {
			System.out.println(elementoBuscar+ "No se encontro en la matriz");
		}

	}

}
