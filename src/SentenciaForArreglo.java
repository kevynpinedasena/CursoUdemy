
import javax.swing.JOptionPane;

public class SentenciaForArreglo {

	public static void main(String[] args) {
		
		String[] nombres = {"juan", "david", "kevyn", "lucas", "mike"};
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase("juan")) {
				nombres[i].equalsIgnoreCase("david");
				continue;
			}
			System.out.println(i+""+nombres[i]);
		}
		
		boolean existe = false;
		String buscar = JOptionPane.showInputDialog("ingrese el nombre: ");

		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i].equalsIgnoreCase(buscar)) {
				existe = true;
				break;
			}
		}
		if(existe) {
			System.out.println("encontrado "+ buscar);
		}
		else {
			System.out.println("no existe");
		}
	}

}
