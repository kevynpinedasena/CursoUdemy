package com.kevyn.clasesWrapper;

public class WrapperBoolean {

	public static void main(String[] args) {
		
		Integer num1 = 1, num2 = 2;
		
		boolean primBoolean = num1 > num2;
		Boolean objetoBoolean = Boolean.valueOf(primBoolean);
		Boolean objBoolean2 = Boolean.valueOf("false");
		
		System.out.println("primBoolean: "+primBoolean);
		System.out.println("objetoBoolean: "+objetoBoolean);
		System.out.println("objBoolean2: "+objBoolean2);
		
		System.out.println("Comparando dos obj boolean: "+ (objetoBoolean == objBoolean2));
		System.out.println("Comparando dos obj boolean: "+ (objetoBoolean.equals(objBoolean2)));

		//convertir un wrapper a un primitivo
		boolean primeBoolean = objBoolean2.booleanValue();
		boolean prime2Boolean = objBoolean2;
	}

}
