import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		String infoFichero=nombreMetodo();
		System.out.println(infoFichero);
}
	public static String nombreMetodo() {
		
		Scanner scanner = null;
		FileInputStream fis = null;
		String infoFichero="";
        try {
        	fis = new FileInputStream("C:\\xampp\\htdocs\\aadd\\aadd\\recursos\\infoinstitutodam2.Json");
            System.setIn(fis);
            scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                infoFichero+=scanner.next();
            }
   
        }
        catch (Exception e){
            if(scanner != null)
            	scanner.close();
            if(fis != null)
				try {
					fis.close();
				} catch (IOException e1) {
					e.printStackTrace();
	}

			}
   return infoFichero;
}
}
