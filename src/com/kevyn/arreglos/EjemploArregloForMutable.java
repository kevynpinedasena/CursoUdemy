package com.kevyn.arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloForMutable {

	public static void main(String[] args) {
		
		String[] productos = {"perros", "carros", "motos", "coches"};
		Arrays.sort(productos);
		
		System.out.println("Usando For\n");
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Posicion " + i + " = " +productos[i]);
		}
		
		System.out.println("\nDecremento con for");
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Posicion "+i+ " = "+productos[productos.length-1-i]);
		}
		
		arregloInverso(productos);
		
//		System.out.println("\nUsando la coleccion de java para inprimir un array de atras para adelante");
//		Collections.reverse(Arrays.asList(productos));
//		for (int i = 0; i < productos.length; i++) {
//			System.out.println("Posicion " + i + " = " +productos[i]);
//		}
	}
	
	public static void arregloInverso(String[] productos) {
		for (int j = 0; j < productos.length/2; j++) {
			String actual = productos[j];
			String inverso = productos[productos.length-1-j];
			productos[j] = inverso;
			productos[productos.length-1-j] = actual;
		}
		
		System.out.println("\nImprime inverso");
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Posicion " + i + " = " +productos[i]);
		}
	}

}
