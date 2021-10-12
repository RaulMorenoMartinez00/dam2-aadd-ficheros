import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class LeerYEscribir {

	public static void main(String[] args) {
		
		sc sc = null;
		FileInputStream linea = null;
        try {
        	linea = new FileInputStream("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt");
            System.setIn(linea);
            sc = new sc(System.in);
            sc.useDelimiter("\n");           
            ArrayList<String> array = new ArrayList<String>();
            String linea="";
            String[] atributos = null;
            while (sc.hasNext()){
            	array.add(sc.next());
            }
            try (PrintStream printStream1 = new PrintStream(new FileOutputStream("C:\\xampp\\htdocs\\aadd\\recursos\\info-alumnos.txt"))) {
				System.setOut(printStream1);
				for(int i=1;i<array.size();i++)
				{					
				atributos=array.get(i).split(",");
					
				if(atributos.length>3)
					linea =atributos[1]+","+atributos[2]+""+atributos[3];
				else
					linea =atributos[1]+","+atributos[2];
				
					System.out.println(linea+", DAM2");
						
				}					
			} catch (IOException e) {
				e.printStackTrace();
			}         
        }
        catch (Exception e){
            if(sc != null)
            	sc.close();
            if(linea != null)
				try {
					linea.close();
				} catch (IOException e1) {
					e.printStackTrace();
				}
        }
	}
}