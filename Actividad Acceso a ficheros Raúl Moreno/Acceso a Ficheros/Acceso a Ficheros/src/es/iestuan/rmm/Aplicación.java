package es.iestuan.rmm;

import es.iestetuan.rmm.fictexto.Programa;

public class Aplicación {

	public static void main(String[] args) {
		Programa nuevo = new Programa();
		System.out.println(nuevo.getAlumno("619"));
		System.out.println(nuevo.getAlumnos());
	}
}
