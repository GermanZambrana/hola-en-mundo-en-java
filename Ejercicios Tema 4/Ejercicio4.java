/**
* Ejercicio4 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio4{
 public static void main(String[] args) {
	  System.out.println("¿Cuántas horas a trabajado esta semana?");
	  int hora = Integer.parseInt(System.console().readLine());
	  
	  if (hora <= 40) {
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
                
                
      if (hora >= 41) {
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
	  ht=16;
                int mul = (primernumero * segundonumero * ht);
                System.out.println("El trabajador gana: " + mul + "€");
	} 
 }
}
		
	
	    
