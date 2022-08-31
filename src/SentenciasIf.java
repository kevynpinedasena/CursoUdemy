import javax.swing.JOptionPane;

public class SentenciasIf {

	public static void main(String[] args) {
		
		int numeroDias = 0;
		int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a�o: "));

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
		while (mes < 1 && mes > 12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
		}
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12) {
			numeroDias = 31;
		}
		else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			numeroDias = 30;
		}
		else if ( mes == 2) {
			if (anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0)) ) {
				numeroDias = 29;
			}
			else {
				numeroDias = 28;
			}
		}
		System.out.println("El numero de dias del mes " +mes+ " son " +numeroDias);
	}

}
