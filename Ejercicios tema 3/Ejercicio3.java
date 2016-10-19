/**
* Ejercicio3 del capitulo 3
*
* @author German Zambrana Ruiz
*/
public class Ejercicio3 {
 public static void main(String[] args) {
	 System.out.println("Dime un número de Pesetas:");
	  String linea;
linea = System.console().readLine();
	    int peseta;
	    peseta = Integer.parseInt( linea );
	    
	 double euro=0.01;
	 double mul = euro * peseta;
	 

        System.out.println(peseta + " pesetas son " + mul + " euros");
	}
}
