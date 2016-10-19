/**
* Ejercicio7 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio8{
 public static void main(String[] args) {
	  System.out.println("Dias a la semana asistidos:");
	     String linea;
	        linea = System.console().readLine();
	int primernumero;
	            primernumero = Integer.parseInt( linea );
	            
	  System.out.println("Horas trabajadas al dia:");
	   String linea2;
	        linea2 = System.console().readLine();
	int segundonumero;
	            segundonumero = Integer.parseInt( linea2 );
	             
	  int ht;
	  ht=12;
                int mul = (primernumero * segundonumero * ht);
                System.out.println("El trabajador gana: " + mul + "€");
			}
		}
