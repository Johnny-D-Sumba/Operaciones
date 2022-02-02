package ec.demos.domain;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Cliente {
	private String cedula;
	private String nombre;
	private String direccion;
	private String email;
	private String fnacimiento;
	
	public Cliente(){
		
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento = fnacimiento;
	}
	
	@Override
	public String toString() {
		return "Cliente [ Cedula: " + cedula + ", Nombre: " + nombre + ", Dirección:" + direccion + 
	", E-mail:" + email + ", Fecha de nacimiento: " + fnacimiento +  "]";
	}
	
	public void edad() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fnacimiento, formato);
		LocalDate fechaact = LocalDate.now();
		
		
		Period periodo = Period.between(fechaNac, fechaact);
		System.out.printf("Su edad es: %s años, %s meses y %s días",
		                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
	}
}
