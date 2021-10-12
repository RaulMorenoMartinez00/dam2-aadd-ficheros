import java.io.FileWriter;

public class EscribirEnFicheros {
public static void main(String[] args) {
	try{
		FileWriter Fichero= new FileWriter("C:\\xampp\\htdocs\\aadd\\aadd\\recursos\\Info-fichero.txt");
		Fichero.write("Nombre, Apellidos, Curso \n");
				
				
				Fichero.close();
	}  catch (Exception e){
		e.printStackTrace();
		}
	EscribeNombre("Raul, Moreno, Martinez", "C:\\\\xampp\\\\htdocs\\\\aadd\\\\aadd\\\\recursos\\\\Info-fichero.txt");
	EscribeNombre("Raul, Moreno, Pito", "C:\\\\xampp\\\\htdocs\\\\aadd\\\\aadd\\\\recursos\\\\Info-fichero.txt");
}
static void EscribeNombre(String Nombre, String Ruta) {
	try{
		FileWriter Fichero= new FileWriter(Ruta,true);
		Fichero.write(Nombre+"\n");
				
				
				Fichero.close();
	}  catch (Exception e){
		e.printStackTrace();
		}
}
}
