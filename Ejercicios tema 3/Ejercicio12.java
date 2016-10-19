/**
* Ejercicio12 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio12 {
 public static void main(String[] args) {
  System.out.println("Dime la nota del primer examen");
	     String linea;
	        linea = System.console().readLine();
	double e1;
	            e1 = Double.parseDouble( linea );
	            
	  System.out.println("¿Qué nota media quieres sacar?");
	   String linea2;
	        linea2 = System.console().readLine();
	double media;
	            media = Double.parseDouble( linea2 );
	double e2 = (media-(e1*0.4))/0.6;
	System.out.println("La nota que debes de sacar en el segundo examen es " + e2);
	}
}
