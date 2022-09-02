package com.kevyn.clasesMatrices;

public class EjemploMatricesSimetricaFor {

	public static void main(String[] args) {
		
		boolean simetrica = true;
		
		int[][] matriz = {
				{1, 2, 3, 4}, 
				{2, 1, 0, 5}, 
				{3, 0, 1, 6}, 
				{4, 5, 6, 7}
		};

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					simetrica = false;
				}
			}
		}
		
		if(simetrica) {
			System.out.println("La matriz es simetrica");
		}
		else {
			System.out.println("la matriz no es simetrica");
		}
	}

}
