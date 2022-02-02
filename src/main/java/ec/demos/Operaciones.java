package ec.demos;
import java.sql.Date;

import ec.demos.domain.*;
public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calculadora=new Calculadora();
		calculadora.setValue(18);
		calculadora.setValue2(24);
		calculadora.suma();
		
		calculadora.setValue(58);
		calculadora.setValue2(24);
		calculadora.resta();
		
		calculadora.setValue(25);
		calculadora.setValue2(15);
		calculadora.modulo();
		
		calculadora.setValue(25);
		calculadora.setValue2(8);
		calculadora.multiplicacion();
		
		Cliente cliente=new Cliente();
		
		cliente.setCedula("0305264856");
		cliente.setNombre("Marcus Lema");
		cliente.setDireccion("Av. de la Americas");
		cliente.setEmail("marcus.l@gmail.com");
		cliente.setFnacimiento("20/12/2001");
		
		
		Cliente cliente2=new Cliente();
		
		cliente.setCedula("0305523456");
		cliente.setNombre("Adrian Reyes");
		cliente.setDireccion("Av. de la Americas");
		cliente.setEmail("reyes.a@gmail.com");
		cliente.setFnacimiento("15/01/2004");
		
		
		System.out.println(cliente);
		cliente.edad();
	}

}


//cliente.setFnacimiento(Date.valueOf("2000-01-15"));