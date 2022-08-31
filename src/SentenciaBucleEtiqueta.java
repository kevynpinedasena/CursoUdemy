
public class SentenciaBucleEtiqueta {

	public static void main(String[] args) {

		String frase = "tres trigo tristes tigres tragaron trigotrigo rn un tregaltrigo";
		
		String palabra = "trigo";
		int contador = 0;
		
		buscar:
		
		for (int i = 0; i <= frase.length()-palabra.length(); i++) {
			int k = i;
			
			for (int j = 0; j < palabra.length(); j++) {
				if (frase.charAt(k++) != palabra.charAt(j)) {
					continue buscar;				
				}
			}
			contador++;
		}
		System.out.println("Encontrado la palabra "+palabra+": "+contador );
	}

}
