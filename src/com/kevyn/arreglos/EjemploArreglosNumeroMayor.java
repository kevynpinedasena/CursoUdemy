package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class EjemploArreglosNumeroMayor {

	public static void main(String[] args) {
		
		int[] numeros = {1, 3, 4, 8, 6};
		
//		este for es para ingresar los datos al arreglo
//		for (int i = 0; i < numeros.length; i++) {
//			int datos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 5 numeros por favor: "));
//			numeros[i] = datos;
//			
//			System.out.println("Numeros = " + numeros[i]);
//		}
		
//		para el numero mayor y menor 
		
		int numeroMayor = 0;
		int numeroMenor = 0;
		
		for (int i = 1; i < numeros.length; i++) {
//			esto funciona como un if en los parentecis va la condicion con el ? retorna el resultado y con los dos puntos : es como el else
			numeroMayor = (numeros[numeroMayor] > numeros[i])? numeroMayor: i;
			numeroMenor = (numeros[numeroMenor] < numeros[i])? numeroMenor: i;
		}
		System.out.println("\nnumero mayor = "+numeros[numeroMayor]);
		System.out.println("Numero menor = " + numeros[numeroMenor]);
	}

}
