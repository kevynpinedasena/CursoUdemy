

public class SentenciaBucleEtiquetaLetra {

	public static void main(String[] args) {
		
		String frase = "tres tristes tigres tragaron trigo rn un tregal";
		
		char letra = 't';
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != letra) {
				continue;
			}
			contador++;
		}
		
		System.out.println("la letra: "+letra+ " encontrada: "+contador);
	}

}
