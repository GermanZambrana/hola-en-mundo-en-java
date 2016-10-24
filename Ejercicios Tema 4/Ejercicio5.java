/**
* Ejercicio5 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio5{
 public static void main(String[] args) {
	 
	 System.out.println("Vamos a resolver una ecuacion de primer grado del tipo ax+b=0");
	    int a;
        int b;
        int x;
        
        System.out.print("Introduce el valor de a: ");
        a = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el valor de b: ");
        b = Integer.parseInt(System.console().readLine());
        
        x = -b/a;
        
        System.out.println("El resultado de la ecuación es " + x);
    }
}
