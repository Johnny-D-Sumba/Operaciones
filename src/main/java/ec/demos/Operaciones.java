package ec.demos;
import java.sql.Date;

import ec.demos.domain.*;
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
		cliente.setFnacimiento("15/01/2001");
		
		
		System.out.println(cliente);
		cliente.edad();
	}

}


//cliente.setFnacimiento(Date.valueOf("2000-01-15"));