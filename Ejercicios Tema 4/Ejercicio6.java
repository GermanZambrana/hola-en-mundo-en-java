/**
* Ejercicio6 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio6{
 public static void main(String[] args) {
	 System.out.println("Vamos a resolver un problema de física");
	 double h;
	 double t;
	 
	System.out.println("Dame el valor de la altura");
	 h = Double.parseDouble(System.console().readLine());
	 t = Math.sqrt(2*h/9.81);
	 System.out.println("El tiempo que tarda en caer el objeto es de " + t + " Segundos");
 }
}
	 
