/**
* Ejercicio11 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio11 {
 public static void main(String[] args) {
	 System.out.println("Cuantos kb hay:");
	  String linea;
linea = System.console().readLine();
	    int kb;
	    kb = Integer.parseInt( linea );
	    
	 double mb=0.00124;
	 double mul = mb * kb;
	 

        System.out.println(kb + " de kb son " + mul + " mb");
	}
}
	
