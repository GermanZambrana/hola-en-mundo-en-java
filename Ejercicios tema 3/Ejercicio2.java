/**
* Ejercicio2 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio2 {
 public static void main(String[] args) {
	 System.out.println("Dime un número de Euros:");
	  String linea;
linea = System.console().readLine();
	    int euro;
	    euro = Integer.parseInt( linea );
	    
	 int pesetas=166;
	 int mul = euro * pesetas;
	 

        System.out.println(euro + " euros son " + mul + " pesetas");
	}
}
	 
	 
	 
	 
	 
