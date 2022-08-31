package com.kevyn.clasesmath;

public class EjemploClaseMathRandom {

	public static void main(String[] args) {
		
		double random = Math.random();
		System.out.println("Random = "+random);
		random *= 7;
		
		System.out.println("random = "+random);

		random = Math.floor(random);
		System.out.println("random piso = "+random);
		
		random = Math.ceil(random);
		System.out.println("random techo = "+random);
	}

}
