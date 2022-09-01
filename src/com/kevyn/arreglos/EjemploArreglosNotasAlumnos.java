package com.kevyn.arreglos;

import javax.swing.JOptionPane;

public class EjemploArreglosNotasAlumnos {

	public static void main(String[] args) {
		
		double[] matematicas, historia, lenguaje;
		
		matematicas = new double[3];
		historia = new double[3];
		lenguaje = new double[3];
		
		double sumaMatematicas = 0, sumaHistoria = 0, sumaLenguaje = 0;
		
		//ingresar notas en el arreglo matematicas
		for (int i = 0; i < matematicas.length; i++) {
			double notaMate = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las notas de matematicas"));
			matematicas[i] = notaMate;
		}
		
		//ingresar notas en el arreglo historia
		for (int j = 0; j < historia.length; j++) {
			double notaHis = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las notas de historia"));
			historia[j] = notaHis;
		}

		//ingresar notas en el arreglo lenguaje
		for (int k = 0; k < lenguaje.length; k++) {
			double notaLengu = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las notas de Lenguaje"));
			lenguaje[k] = notaLengu;
		}

		//for para sumar las notas
		for (int i = 0; i < 3; i++) {
			sumaMatematicas += matematicas[i];
			sumaHistoria += historia[i];
			sumaLenguaje += lenguaje[i];
		}
		
		double promedioMatematicas = (sumaMatematicas/matematicas.length);
		double promedioHistoria = (sumaHistoria/historia.length);
		double promedioLenguaje = (sumaLenguaje/lenguaje.length);
		
		double promedioCurso = (promedioMatematicas+promedioHistoria+promedioLenguaje/3);
		
		System.out.println("Promedio de la materia matematicas = "+ promedioMatematicas);
		System.out.println("Promedio de la materia historia = "+ promedioHistoria);
		System.out.println("Promedio de la materia lenguaje = "+ promedioLenguaje);
		
		System.out.println("Promedio del curso = "+ promedioCurso);

	}

}
