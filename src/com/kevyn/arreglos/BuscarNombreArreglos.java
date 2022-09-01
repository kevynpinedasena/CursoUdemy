package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class BuscarNombreArreglos {

	public static void main(String[] args) {
		
		String[] nombres = new String[4];
		
		for (int i = 0; i < nombres.length; i++) {
			String nom = JOptionPane.showInputDialog("Ingrese nombres");
			nombres[i] = nom;
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(i+ " - " +nombres[i]);
		}
		
		String buscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
		
		int j;
		for ( j = 0; j < nombres.length && !nombres[j].equalsIgnoreCase(buscar); j++) {
		}
		
		if (j == nombres.length) {
			System.out.println("No se encontro");
		}
		else if(nombres[j].equalsIgnoreCase(buscar)) {
			System.out.println("Se Encontro en la posicion: "+j +" - "+ nombres[j] );
		}

	}

}
