import javax.swing.JOptionPane;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la tabla de multiplicar"));
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+ "X" +j+ " = "+ i*j);
			}
			System.out.println();
		}
	}
}