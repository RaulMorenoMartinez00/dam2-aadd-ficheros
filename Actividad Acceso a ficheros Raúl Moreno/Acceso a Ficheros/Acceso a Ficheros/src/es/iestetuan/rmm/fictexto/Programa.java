package es.iestetuan.rmm.fictexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.iestetuan.uar.dao.IUsuario;
import es.iestetuan.uar.vo.Alumno;

public class Programa implements IUsuario {

	@Override
	public Alumno getAlumno(String id) {
		Alumno nuevo = new Alumno();
		try(BufferedReader br=new BufferedReader(new FileReader("alumnos-dam2-nuevos.txt"))){
	        	String linea=br.readLine();
	        	linea=br.readLine();
	            while(linea!=null){	   
	            	String [] atributos = linea.split(",");
	            	if (atributos[0].equals(id)) {
	            		nuevo.setNia(atributos[0]);;
	            		nuevo.setNombre(atributos[1]);
	            		if (atributos.length > 3) {
	            			nuevo.setApellido1(atributos[2]);
	            			nuevo.setApellido2(atributos[3]);
	            		} else {
	            			nuevo.setApellido1(atributos[2]);
	            			nuevo.setApellido2("Sin 2º apellido");
	            		}
	            		return nuevo;
	            	}
	            	linea=br.readLine();
	            } 
	        }catch(IOException e){
	            System.out.println("Error E/S: "+e);	        
	        }
		return nuevo;
	}

	@Override
	public List<Alumno> getAlumnos() {
		ArrayList<Alumno> nuevo = new ArrayList<Alumno>();
		try(BufferedReader br=new BufferedReader(new FileReader("alumnos-dam2-nuevos.txt"))){
        	String linea=br.readLine();
        	linea=br.readLine();
            while(linea!=null){	   
            	Alumno AlumnoB = new Alumno();
            	String [] atributos = linea.split(",");
            	AlumnoB.setNie(atributos[0]);
            	AlumnoB.setNombre(atributos[1]);
            	AlumnoB.setApellido1(atributos[2]);
            	if (atributos.length > 3) {
            		AlumnoB.setApellido2(atributos[3]);
            	}
            nuevo.add(AlumnoB);
            linea=br.readLine();
            } 
        }catch(IOException e){
            System.out.println("Error E/S: "+e);	        
        }
		return nuevo;
	}

}
