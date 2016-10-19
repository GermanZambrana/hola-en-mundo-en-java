/**
* Ejercicio9 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio9{
 public static void main(String[] args) {
	  System.out.println("Introduce el radio");
	     String linea;
	        linea = System.console().readLine();
	double radio;
	            radio = Double.parseDouble( linea );
	            
	  System.out.println("Introduce la hipotenusa");
	   String linea2;
	        linea2 = System.console().readLine();
	double hipotenusa;
	            hipotenusa = Double.parseDouble( linea2 );
	        double mul = (radio * radio * hipotenusa * 3.1415) / 3;
	        System.out.println("El volumen del cono es " + mul + " cm3");
		}
	}
	           
