package com.kevyn.clasesWrapper;

public class AutoBoxingInteger {

	public static void main(String[] args) {

		Integer [] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int suma = 0;
		
		for (Integer datos : enteros) {
			if (datos.intValue() % 2 == 0) {
				suma = suma + datos.intValue();
			}
		}
		System.out.println("Suma = "+ suma);
		
		suma = 0;
		
		for (Integer datos : enteros) {
			if (datos % 2 == 0) {
				suma = suma + datos;
			}
		}
		System.out.println("Suma = "+ suma);
	}

}
