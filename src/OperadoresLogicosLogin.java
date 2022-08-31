import javax.swing.JOptionPane;

public class OperadoresLogicosLogin {

	public static void main(String[] args) {

		String userName = "kevyn";
		String password = "kevyn123";
		
		String user = JOptionPane.showInputDialog("Ingrese su Username: ");
		String passw = JOptionPane.showInputDialog("Ingrese su Password: ");
		
		boolean existe = false;
		
		if (userName.equalsIgnoreCase(user) && password.equalsIgnoreCase(passw)) {
			existe = true;
		}
		else {
			System.out.println("Username o password incorrectos");
		}
		
		if (existe == true) {
			System.out.println("bien venido "+user);
		}
		else {
			System.out.println("Lo siento requiere autenticacion");
		}
	}

}
