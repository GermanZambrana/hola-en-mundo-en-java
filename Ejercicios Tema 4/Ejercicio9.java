/**
* Ejercicio9 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio9{
 public static void main(String[] args) {
        System.out.println("Calcular una ecuación de segundo grado :");
      
        double a;
        double b;
        double c;
        double x1; 
        double x2; 
         System.out.println("Dame el valor de a ");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("Dame el valor de b ");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("Dame el valor de c ");
        c = Double.parseDouble(System.console().readLine());

if ((a == 0) && (b == 0) && (c == 0)) {
			System.out.println("La ecuación tiene infinitas soluciones.");
    }				
		if ((a == 0) && (b == 0) && (c != 0)) {
			System.out.println("La ecuación no tiene solución.");
    }				
		if ((a != 0) && (b != 0) && (c == 0)) {
			System.out.println("x1 = 0");
			System.out.println("x2 = " + (-b / a));
    }		
		if ((a == 0) && (b != 0) && (c != 0)) {
			System.out.println("x1 = x2 = " + (-c / b));
    }		
		if ((a != 0) && (b != 0) && (c != 0)) {					
			double discriminante = b*b - (4 * a * c);			
			if (discriminante < 0) {
					System.out.println("La ecuación no tiene soluciones reales");
			}	else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(4 * a * c));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(4 * a * c));
      }
    }
					
	}
}
       
 
