import javax.swing.JOptionPane;

public class OperadorTernarioNumeroMayor {

	public static void main(String[] args) {

		int maximo = 0;
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 3: "));
		
		maximo = (num1 > num2) ? num1 : num2;
		maximo = (maximo > num3) ? maximo : num3;
		
		System.out.println("numero 1: "+num1);
		System.out.println("numero 2: "+num2);
		System.out.println("numero 3: "+num3);
		System.out.println("numero mayor es: "+maximo);

	}

}
