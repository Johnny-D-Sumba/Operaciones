package ec.demos;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		
		Operacion operaciones=new Operacion();
		operaciones.setValue(12);
		operaciones.setValue2(15);
		operaciones.suma();
		
		operaciones.setValue(24);
		operaciones.setValue2(12);
		operaciones.resta();
		
		operaciones.setValue(4);
		operaciones.setValue2(8);
		operaciones.multiplicacion();
		
		operaciones.setValue(18);
		operaciones.setValue2(3);
		operaciones.division();
	}

}
