package es.iestetuan.rmm.vo;

public class Alumno extends Persona {
	String nia;

	public Alumno () {
		
	}

	public Alumno(String dni, String name, String ap1, String ap2, String imiel, String id) {
		super(dni, name, ap1, ap2, imiel);
		nia = id;
	}

	public String getNia() {
		return nia;
	}

	public void setNia(String nia) {
		this.nia = nia;
	}

	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nie=" + nie + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", email=" + email + "]";
	}
}
