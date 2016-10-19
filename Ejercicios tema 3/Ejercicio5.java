/**
* Ejercicio5 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio5{
 public static void main(String[] args) {
	  System.out.println("Dime un numero");
	     String linea;
	        linea = System.console().readLine();
	int primernumero;
	            primernumero = Integer.parseInt( linea );
	            
	  System.out.println("Dime el segundo numero");
	   String linea2;
	        linea2 = System.console().readLine();
	int segundonumero;
	            segundonumero = Integer.parseInt( linea2 );
	            int mul = (primernumero * segundonumero);
	            System.out.println("El area del rectangulo es " + mul);
			}
		}
	            
