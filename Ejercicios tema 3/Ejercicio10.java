/**
* Ejercicio10 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio10 {
 public static void main(String[] args) {
	 System.out.println("Cuantos MB hay:");
	  String linea;
linea = System.console().readLine();
	    int Mb;
	    Mb = Integer.parseInt( linea );
	    
	 int kB=1024;
	 int mul = Mb * kB;
	 

        System.out.println(Mb + " de MB son " + mul + " KB");
	}
}
	 
