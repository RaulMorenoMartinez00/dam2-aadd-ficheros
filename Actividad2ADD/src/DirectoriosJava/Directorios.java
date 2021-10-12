package DirectoriosJava;

import java.util.Properties;

public class Directorios {
	public Directorios() {
		Properties config = new Properties();
		InputStream Entrada = null;
		try {
			Entrada = new FileinputStream();
			config.load(Entrada);
			
		} catch (Exception e) {
		
		}
	}
}
