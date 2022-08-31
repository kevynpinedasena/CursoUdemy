package com.kevyn.clasesWrapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		//se le setea nueva año mes dia y hora al calendario para que lo imprima
		//en esta clase Calendar los meses van de 0 a 11 estonces diciembre es 11
//		calendario.set(2020, Calendar.SEPTEMBER, 25, 19, 20);

//		aca le seteamos el año el mes y el dia
		calendario.set(Calendar.YEAR, 2020);
		calendario.set(Calendar.MONTH, Calendar.JULY);
		calendario.set(Calendar.DAY_OF_MONTH, 25);
		
//		en estos pasos le seteamos la hora los minutos y los segundos
//		calendario.set(Calendar.HOUR_OF_DAY, 21);
		calendario.set(Calendar.HOUR, 7);
		calendario.set(Calendar.AM_PM, Calendar.PM);
		calendario.set(Calendar.MINUTE, 20);
		calendario.set(Calendar.SECOND, 10);
		
		Date fecha = calendario.getTime();
		System.out.println("Fecha sin formato = "+ fecha);
		
//		aca estamos mostrando la fecha con formato comienza yyyy minusculas = año, MM mayuscula = mes, dd minusculas = dia, HH:mm:ss HH = hora mm = minutos
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		String fechaConFormato = formato.format(fecha);
		System.out.println("Fecha con formato = "+fechaConFormato);
		
	}

}
