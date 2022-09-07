package com.kevyn.Poo;

public class Principal {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil();
		subaru.setFabricante("Subaru");
		subaru.setModelo("2020");
		subaru.setColor(Color.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setCilindrada(2.0);
		subaru.setCapacidadTanque(15);
		
		Automovil mazda = new Automovil();
		mazda.setFabricante("Mazda");
		mazda.setModelo("BT-500");
		mazda.setColor(Color.ROJO);
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setCilindrada(5.0);
		mazda.setCapacidadTanque(10);
		
		System.out.println("SUBARU");
		System.out.println(subaru.imprimirInformacion());
		System.out.println(subaru.acelerar(300));
		System.out.println(subaru.frenar());
		System.out.println(subaru.acelerarFrenar(1000));
		System.out.println("Kilometro por litro: "+ subaru.calcularConsumo(150, 10));
		
		System.out.println("\nMAZDA");
		System.out.println(mazda.imprimirInformacion());
		System.out.println(mazda.acelerar(200));
		System.out.println(mazda.frenar());
		System.out.println(mazda.acelerarFrenar(4500));
		System.out.println("Kilometro por litro: "+ subaru.calcularConsumo(100, 20));
		
		//con el toString se impreme somo el objeto
		System.out.println("\n"+mazda);
	}

}
