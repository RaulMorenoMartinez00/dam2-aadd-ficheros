package es.iestetuan.rmm.vo;

public class Persona {
	public String nie;
	public String nombre;
	public String apellido1;
	public String apellido2;
	public String email;
	
	public Persona() {
		nie = "Sin NIE";
		nombre = "Sin Nombre";
		apellido1 = "Sin Apellido1";
		apellido2 = "Sin Apellido2";
		email = "Sin Email";
	}
	
	public Persona (String dni, String name, String ap1, String ap2, String imiel)  {
		nie = dni;
		nombre = name;
		apellido1 = ap1;
		apellido2 = ap2;
		email = imiel;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
