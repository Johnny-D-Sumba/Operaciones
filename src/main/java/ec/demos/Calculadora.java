package ec.demos;

public class Calculadora extends Operacion {
	
	public void modulo() {
		int result= getValue()% getValue2();
		System.out.println("Modulo: " + result);
	}
	
	
}
