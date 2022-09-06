package com.kevyn.clasesMatrices;

public class EjemploMatricesSumarFilasColumnas {

	public static void main(String[] args) {
		
		int sumaFila, sumaColumnas;
		
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i = 0; i < a.length; i++) {
			sumaFila = 0;
			sumaColumnas = 0;
			
			for (int j = 0; j < a[i].length; j++) {
				sumaFila = sumaFila + a[i][j];
				sumaColumnas = sumaColumnas + a[j][i];
			}
			System.out.println("Total fila " + i + " : " +sumaFila);
			System.out.println("Total columna " + i + " : " +sumaColumnas);
		}

	}

}
