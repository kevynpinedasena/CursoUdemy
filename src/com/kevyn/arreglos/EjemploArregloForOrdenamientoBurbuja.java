package com.kevyn.arreglos;

public class EjemploArregloForOrdenamientoBurbuja {

	public static void main(String[] args) {
		
		String[] productos = {"platos", "carros", "motos", "armario"};
		
		int contador = 0;
		
		for (int i = 0; i < productos.length; i++) {
			for (int j = 0; j < productos.length; j++) {
				if (productos[i].compareTo(productos[j]) < 0) {
					String aux = productos[i];
					productos[i] = productos[j];
					productos[j] = aux;
				}
				contador++;
			}
		}
		System.out.println(contador);
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Indice "+i+ " = "+productos[i]);
		}
	}

}
