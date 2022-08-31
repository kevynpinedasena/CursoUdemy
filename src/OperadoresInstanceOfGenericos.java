
public class OperadoresInstanceOfGenericos {

	public static void main(String[] args) {
		
		Object texto = "hola mundo";
		Number num = 1;
		
		Boolean b1 = texto instanceof String;
		System.out.println("texto es de tipo String = "+b1);
		
		b1 = texto instanceof Object;
		System.out.println("texto es de tipo Object = "+b1);
		
		b1 = texto instanceof Integer;
		System.out.println("texto es de tipo Integer = "+b1);
		
		b1 = texto instanceof Double;
		System.out.println("texto es de tipo Double = "+b1);
		
		b1 = num instanceof Object;
		System.out.println("num es de tipo Object = "+b1);
		
		b1 = num instanceof Integer;
		System.out.println("num es de tipo Integer = "+b1);

		b1 = num instanceof Double;
		System.out.println("num es de tipo Double = "+b1);
		
		b1 = num instanceof Long;
		System.out.println("num es de tipo Long = "+b1);
	}

}
