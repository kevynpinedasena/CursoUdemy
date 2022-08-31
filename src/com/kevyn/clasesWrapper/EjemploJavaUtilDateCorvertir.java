package com.kevyn.clasesWrapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class EjemploJavaUtilDateCorvertir {

	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
//		parseando un date a un format primero se pone el año despues mes y luego dia
		try {
			String fec = JOptionPane.showInputDialog("Ingrese la fecha año-mes-dia");
			Date fecha = format.parse(fec);
			System.out.println("Fecha: "+fecha);
			System.out.println("Format: "+format.format(fecha));
			
			Date fechaActual = new Date();
			System.out.println("FechaActual = "+fechaActual);
			
			if (fecha.after(fechaActual)) {
				System.out.println("Fecha del usuario es despues que fechaActual");
			}
			else if (fecha.before(fechaActual)) {
				System.out.println("Fecha es anterior que fechaActual");
			}
			else if (fecha.equals(fechaActual)) {
				System.out.println("fecha es igual a fechaActual");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
