package com.kevyn.clasesMatrices;

public class EjemploMatrices1 {

	public static void main(String[] args) {
		
		int[][] numeros = {{1, 2, 3}, {11, 12, 13}};
		
		System.out.println("Numero de filas: " +numeros.length);
		System.out.println("Numero de columnas: " + numeros[0].length);
		System.out.println("Numero de columnas 2: " + numeros[1].length);
		
		System.out.println("Primer elemento de la matriz: " +numeros[0][0]);
		System.out.println("Ultimo elemento de la primera columna: "+numeros[numeros.length - 1][numeros[1].length - 1]);

	}

}
