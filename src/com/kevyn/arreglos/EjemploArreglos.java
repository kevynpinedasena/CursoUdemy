package com.kevyn.arreglos;

import java.util.Arrays;

public class EjemploArreglos {

	public static void main(String[] args) {
		
		String [] productos = new String[7];
		
		productos[0] = "Kingston";
		productos[1] = "play";
		productos[2] = "loro";
		productos[3] = "bicicleta";
		productos[4] = "carro";
		productos[5] = "moto";
		productos[6] = "torre";
		
		System.out.println("producto: "+productos[0]);
		System.out.println("producto: "+productos[1]);
		System.out.println("producto: "+productos[2]);
		System.out.println("producto: "+productos[3]);
		System.out.println("producto: "+productos[4]);
		System.out.println("producto: "+productos[5]);
		System.out.println("producto: "+productos[6]+"\n");
		
		Arrays.sort(productos);
		
		//con un for
		for (String datosPro : productos) {
			System.out.println(datosPro);
		}
		
		
		
		int [] numeros = {1, 2, 3, 4, 5};
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println(numeros[4]);
		
		
	}

}
