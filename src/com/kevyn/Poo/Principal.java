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
		
		
		System.out.println("\nTipo Subaru\n");
		TipoAutomovil tipoMazda = mazda.getTipo();
		System.out.println("tipo mazda: " + tipoMazda.getNombre() + 
				"\nTipo descripcion mazda: " + tipoMazda.getDescripcion());
		
		switch (tipoMazda) {
			case CONVERTIBLE:
				System.out.println("El auto es deportivo y descapotable de dos puertas");
				break;
				
			case COUPE:
				System.out.println("Es un auto pequeño de dos puertas y tipicamente deportivo"); 
				break;
				
			case FURGON:
				System.out.println("Es un automovil utilitario de transporte, de empresa");
				break;
				
			case HATCHBACK:
				System.out.println("Es un automovil mediano compacto, aspecto deportivo");
				break;
				
			case PICKUP:
				System.out.println("Es un automovil de doble cabina o camioneta");
				break;
				
			case SEDAN:
				System.out.println("es un automovil mediano");
				break;
				
			case STATION_WAGON:
				System.out.println("Es un automovil mas grande con maleta grande....");
				break;

			default:
				break;
		}
		
	}

}
