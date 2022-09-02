package com.kevyn.clasesMatrices;

public class EjemploMatricesStringFor {

	public static void main(String[] args) {
		
		String[][] nombres = {{"juan", "david"}, {"vera", "samuel"}, {"kevyn", "pepe"}};
		
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				System.out.println(nombres[i][j]+" \t");
			}
		}
		System.out.println();
		
		//con el forech
		for (String[] filas : nombres) {
			for (String nombre : filas) {
				System.out.println(nombre);
			}
		}
		
	}

}
