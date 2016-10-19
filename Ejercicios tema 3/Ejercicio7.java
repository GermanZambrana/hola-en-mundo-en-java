/**
* Ejercicio7 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio7{
 public static void main(String[] args) {
	  System.out.println("Precio de la leche");
	     String linea;
	        linea = System.console().readLine();
	double primernumero;
	            primernumero = Double.parseDouble( linea );
	            
	  System.out.println("Precio de los cereales");
	   String linea2;
	        linea2 = System.console().readLine();
	double segundonumero;
	            segundonumero = Double.parseDouble( linea2 );
	             System.out.println("Precio de los huevos");
	   String linea3;
	        linea3 = System.console().readLine();
	double tercernumero;
	            tercernumero = Double.parseDouble( linea3 );
	            double sum = (primernumero + segundonumero + tercernumero);
	            System.out.println("--------------------");
	            System.out.println("El precio total es: " + sum);
			}
		}
	            
