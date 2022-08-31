import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		
		String estado = "";

		double matematicas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de matematicas"));
		while (matematicas < 0 || matematicas > 5) {
			System.out.println("Solo son notas de 0 a 5");
			matematicas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de matematicas"));
		}
		
		double ciencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de ciencias"));
		while (ciencia < 0 || ciencia > 5) {
			System.out.println("Solo son notas de 0 a 5");
			ciencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de ciencias"));
		}
		
		double historia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de historia"));
		while (historia < 0 || historia > 5) {
			System.out.println("Solo son notas de 0 a 5");
			historia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de historia"));
		}
		
		double prome = ( matematicas + ciencia + historia ) / 3;
		
		estado = prome >= 5 ? "Aprovado": "Rechazado";
		System.out.println("Promedio: " + prome + " estado: "+estado);
	}

}
