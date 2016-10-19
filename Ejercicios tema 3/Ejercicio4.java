/**
* Ejercicio4 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio4 {
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
	            int sum = primernumero + segundonumero;
	               System.out.println("El resultado de la suma es " + sum);
	            int res = primernumero - segundonumero;
	               System.out.println("El resultado de la resta es " + res);
	            int mul = primernumero * segundonumero;
	               System.out.println("El resultado de la multiplicacion es " + mul);
	            double division;
	            division = (double)primernumero / (double)segundonumero;
	               System.out.println("El resultado de la division es " + division);
			   }
		   }
	            
	
	
	 
