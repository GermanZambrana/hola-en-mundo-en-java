/**
* Ejercicio1 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio1 {
 public static void main(String[] args) {
	 System.out.println("Dime un número");
	  String linea;
linea = System.console().readLine();
	    int primernumero;
	    primernumero = Integer.parseInt( linea );
	    
	    System.out.print("Dime otro número ");
linea = System.console().readLine();
int segundonumero;
segundonumero = Integer.parseInt( linea );

int mul = (primernumero * segundonumero);
        System.out.println("El resultado de la operación es " + mul);
	}
}
	 
	 
	 
	 
	 
