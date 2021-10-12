package es.iestetuan.rmm.vo;

public class Profesor extends Persona{
	String departamento;
	
	private Profesor () {
		
	}

	public Profesor(String dni, String name, String ap1, String ap2, String imiel, String dep) {
		super(dni, name, ap1, ap2, imiel);
		departamento = dep;
	}
	
	
}
