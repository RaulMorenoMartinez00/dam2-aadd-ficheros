package es.iestetuan.rmm.dao;
import es.iestetuan.rmm.vo.Alumno;
import java.util.List;

public interface IUsuario {
	public Alumno getAlumno(String id);
	public List<Alumno> getAlumnos();
}
