package DirectoriosJava;


import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Prueba {
	public static void main(String[] args) {
	{
		Path ruta;
		
	try {
	
	JsonParser parser = new JsonParser();
	JsonArray a = (JsonArray) parser.parse(new FileReader("Configuracion.json"));
	for (Object O : a) {
		JsonObject ozuna= (JsonObject)O;
		String valor= ozuna.get("carpeta1").toString();

	}
	Object object =  parser.parse(new FileReader("Configuracion.json"));
	JsonObject config = (JsonObject) object;
	File fichero= new File(config.get("carpeta1").toString());
	fichero.createNewFile();
	
	
	
	}catch(Exception e) {
		System.err.println("Malo");
	}
	
	
}
}
}
